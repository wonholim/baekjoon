import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> list = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int b = Integer.parseInt(br.readLine());
		for(int i = 0; i < b; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			if(a.equals("push")) {
				list.push(Integer.parseInt(st.nextToken()));
			}else if(a.equals("top")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.peek()).append("\n");
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
					sb.append(list.pop()).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}