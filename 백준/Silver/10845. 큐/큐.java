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
		Queue<Integer> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int b = Integer.parseInt(br.readLine());
		int back = 0;
		for(int i = 0; i < b; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			if(a.equals("push")) {
				back = Integer.parseInt(st.nextToken());
				list.offer(back);
			}else if(a.equals("front")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.peek()).append("\n");
				}
			}else if(a.equals("back")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(back).append("\n");
				}
			}else if(a.equals("size")) {
				sb.append(list.size()).append("\n");
			}else if(a.equals("empty")) {
				if(list.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
			}else if(a.equals("pop")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.poll()).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}