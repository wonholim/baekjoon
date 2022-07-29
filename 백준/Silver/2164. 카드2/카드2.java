import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= a; i++) {
			q.offer(i);
		}
		while(!q.isEmpty()) {
			if(q.size() == 1) {
				sb.append(q.poll());
				break;
			}
			q.poll();
			int b = q.poll();
			q.offer(b);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}