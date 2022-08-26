import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int wcount;
	static int bcount;
	static int count;
	static int jj;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		String[] c = new String[a];
		for(int i = 0; i < a; i++) {
			c[i] = br.readLine();
		}
		count = 0;
		int t = a - 7;
		while(t --> 0) {
		for(int i = 0; i <= b - 8; i++) {
			for(int j = count; j < 8 + count; j++) {
				jj = j - count;
				check(c[j].substring(i , i + 8));
			}
			list.add(wcount);
			list.add(bcount);
			wcount = 0;
			bcount = 0;
		}
		count++;
		}
		Collections.sort(list);
		sb.append(list.get(0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void check(String s) {
		// TODO Auto-generated method stub
		String a = "WBWBWBWB";
		String b = "BWBWBWBW";
		if(jj % 2 == 0) {
			for(int i = 0; i < s.length(); i++) {
				if(a.charAt(i) != s.charAt(i)) {
					wcount++;
				}
			}
			for(int i = 0; i < s.length(); i++) {
				if(b.charAt(i) != s.charAt(i)) {
					bcount++;
				}
			}
		}else {
			for(int i = 0; i < s.length(); i++) {
				if(a.charAt(i) != s.charAt(i)) {
					bcount++;
				}
			}
			for(int i = 0; i < s.length(); i++) {
				if(b.charAt(i) != s.charAt(i)) {
					wcount++;
				}
			}
	}
	}
}
