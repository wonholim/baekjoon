
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static class Suffix implements Comparable<Suffix>{
		int index;
		int rank;
		int nextRank;

		public Suffix(int index, int rank) {
			this.index = index;
			this.rank = rank;
		}

		@Override
		public int compareTo(Suffix o) {
			if(this.rank != o.rank) {
				return this.rank - o.rank;
			}
			return this.nextRank - o.nextRank;
		}
	}
	public static String str;
	public static ArrayList<Integer> suffix;
	static int n;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		String str = br.readLine();
		Suffix[] arr = makeSuffixArray(str);
		int[] lcp = Lcp(str, arr);
		int max = 0;
		for (int i = 0; i < lcp.length; i++) {
			max = Math.max(max, lcp[i]);
		}
		sb.append(max);
		System.out.println(sb.toString());
	}
	public static int[] Lcp(String s , Suffix[] suffixArray) {
		n = suffixArray.length;
		int[] lcp = new int[n-1];
		int[] suffix = new int[n];
		for (int i = 0; i < n; i++) {
			suffix[suffixArray[i].index] = i;
		}
		int t = 0;
		for (int i = 0; i < n; i++) {
			if(suffix[i] == n-1) {
				t = 0;
				continue;
			}
			int j = suffixArray[suffix[i] + 1].index;
			while(i + t < n && j + t < n) {
				if(s.charAt(i+t) != s.charAt(j+t))
					break;
				t++;
			}

            lcp[suffix[i]] = t;  
            if(t > 0)
            	t--;
		}
		return lcp;
	}
	public static Suffix[] makeSuffixArray(String s) {
		n = s.length();
		Suffix[] suffixes = new Suffix[n];
		for (int i = 0; i < n; i++) {
			suffixes[i] = new Suffix(i, s.charAt(i) - 'a');
		}
		for (int i = 0; i + 1 < n; i++) {
			suffixes[i].nextRank = suffixes[i+1].rank;
		}
		suffixes[n-1].nextRank = -1;
		Arrays.sort(suffixes);
		int[] temp = new int[n];
		for (int t = 2; t < n; t <<= 1) {
			int rank = 0;
			int piv = suffixes[0].rank;
			suffixes[0].rank = rank;
			temp[suffixes[0].index] = 0;
			for (int i = 1; i < n; i++) {
				if(suffixes[i].rank == piv && suffixes[i].nextRank == suffixes[i-1].nextRank) {
					piv = suffixes[i].rank;
					suffixes[i].rank = rank;
				} else {
					piv = suffixes[i].rank;
					suffixes[i].rank = ++rank;
				}
				temp[suffixes[i].index] = i;
			}
			for (int i = 0; i < n; i++) {
				int nextindex = suffixes[i].index + t;
				if(nextindex >= n) {
					suffixes[i].nextRank = -1;
					continue;
				}
				suffixes[i].nextRank = suffixes[temp[nextindex]].rank;
			}
			Arrays.sort(suffixes);
			if(rank == n - 1) {
				break;
			}
		}
		return suffixes;
	}
}
