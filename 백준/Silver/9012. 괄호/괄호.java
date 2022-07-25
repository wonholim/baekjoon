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
		while(a --> 0) {
			Queue<String> q = new LinkedList<>();
			st = new StringTokenizer(br.readLine(), " ");
			String c = st.nextToken();
			for(int i = 0; i < c.length(); i++) {
				if(c.charAt(i) == '(') {
					q.offer("(");
				}else {
					if(!q.isEmpty()) {
						q.poll();
					}else{
						q.offer(")");
						break;
					}
				}
			}
			if(q.isEmpty()) {
				sb.append("YES").append("\n");
			}else {
				sb.append("NO").append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}