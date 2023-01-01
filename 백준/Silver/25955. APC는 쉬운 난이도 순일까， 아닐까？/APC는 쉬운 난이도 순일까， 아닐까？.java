

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static class Tier implements Comparable<Tier>{
		int t;
		int l;
		public Tier(int t, int l) {
			this.t = t;
			this.l = l;
		}
		@Override
		public int compareTo(Tier o) {
			// TODO Auto-generated method stub
			if(this.t == o.t) {
				return o.l - this.l;
			}else {
				return this.t - o.t;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		ArrayList<Tier> original = new ArrayList<>();
		ArrayList<Tier> sorted = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while(t --> 0) {
			String k = st.nextToken();
			int tier = 0;
			if(k.charAt(0) == 'B') {
				tier = 1;
			}else if(k.charAt(0) == 'S') {
				tier = 2;
			}else if(k.charAt(0) == 'G') {
				tier = 3;
			}else if(k.charAt(0) == 'P') {
				tier = 4;
			}else if(k.charAt(0) == 'D') {
				tier = 5;
			} 
			int level = Integer.parseInt(k.substring(1, k.length()));
			original.add(new Tier(tier, level));
			sorted.add(new Tier(tier, level));
		}
		Collections.sort(sorted);
		Queue<Tier> q = new ArrayDeque<>();
		for(int i = 0; i < sorted.size(); i++) {
			Tier ori = original.get(i);
			Tier sort = sorted.get(i);
			if(ori.l != sort.l || ori.t != sort.t) {
				q.offer(sort);
			}
		}
		if(!q.isEmpty()) {
			sb.append("KO\n");
			while(!q.isEmpty()) {
				Tier ans = q.poll();
				char tier = ' ';
				if(ans.t == 1) {
					tier = 'B';
				}else if(ans.t == 2) {
					tier = 'S';
				}else if(ans.t == 3) {
					tier = 'G';
				}else if(ans.t == 4) {
					tier = 'P';
				}else if(ans.t == 5) {
					tier = 'D';
				} 
				sb.append(tier + "" + ans.l + " ");
			}
		}else {
			sb.append("OK");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
