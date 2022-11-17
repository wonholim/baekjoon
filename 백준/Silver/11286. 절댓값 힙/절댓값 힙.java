

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static class Abs implements Comparable<Abs>{
		int real;
		int back;
		public Abs(int real, int back) {
			this.real = real;
			this.back = back;
		}
		@Override
		public int compareTo(Abs o) {
			// TODO Auto-generated method stub
			if(this.real != o.real) return this.real - o.real;
			return this.back - o.back;
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		PriorityQueue<Abs> pq = new PriorityQueue<>();
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			if(k == 0) {
				if(!pq.isEmpty()) {
					sb.append(pq.poll().back + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}else {
				pq.offer(new Abs(Math.abs(k), k));
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
