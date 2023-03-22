
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static PriorityQueue<Integer> min;
	static PriorityQueue<Integer> max;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		min = new PriorityQueue<>();
		max = new PriorityQueue<>(Collections.reverseOrder());
		int t = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= t; i++) {
			int k = Integer.parseInt(br.readLine());
			if(min.size() == max.size()) max.offer(k);
			else min.offer(k);
			if(min.isEmpty() || max.isEmpty()) {sb.append(max.peek()).append("\n"); continue;}
			if(min.peek() < max.peek()) swap();
			sb.append(max.peek()).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void swap() {
		// TODO Auto-generated method stub
		int k = min.poll();
		min.offer(max.poll());
		max.offer(k);
	}

}
