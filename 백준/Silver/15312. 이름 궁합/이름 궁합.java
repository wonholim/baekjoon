

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String n = st.nextToken();
		String l = br.readLine();
		Queue<Integer> q = new ArrayDeque<>();
		int[] c = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		for(int i = 0; i < n.length(); i++) {
			q.offer(c[n.charAt(i) - 'A']);
			q.offer(c[l.charAt(i) - 'A']);
		}
		while(q.size() != 2) {
			int k = q.poll();
			int w = q.size();
			while(w --> 0) {
				int j = q.poll();
				int sum = k + j;
				if(sum >= 10) sum = sum - 10;
				q.offer(sum);
				k = j;
			}
		}
		sb.append(q.poll() + "" + q.poll());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
