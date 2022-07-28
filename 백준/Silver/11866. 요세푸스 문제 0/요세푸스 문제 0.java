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
		Queue<Integer> q = new LinkedList<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= a; i++) {
			q.offer(i);
		}
		int count = 0;
		sb.append("<");
		while(!q.isEmpty()) {
			if(count == b - 1) {
				count = 0;
				if(q.size() == 1) {
					sb.append(q.poll()).append(">");
				}else {
					sb.append(q.poll()).append(", ");
				}
			}else {
				int c = q.poll();
				q.offer(c);
				count++;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}