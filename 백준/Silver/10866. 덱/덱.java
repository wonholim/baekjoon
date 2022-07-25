import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int b = Integer.parseInt(br.readLine());
		for(int i = 0; i < b; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			if(a.equals("push_front")) {
				list.offerFirst(Integer.parseInt(st.nextToken()));
			}else if(a.equals("push_back")){
				list.offerLast(Integer.parseInt(st.nextToken()));
			}else if(a.equals("front")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.peekFirst()).append("\n");
				}
			}else if(a.equals("back")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.peekLast()).append("\n");
				}
			}else if(a.equals("size")) {
				sb.append(list.size()).append("\n");
			}else if(a.equals("empty")) {
				if(list.isEmpty()) {
					sb.append("1").append("\n");
				}else {
					sb.append("0").append("\n");
				}
			}else if(a.equals("pop_front")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.pollFirst()).append("\n");
				}
			}else if(a.equals("pop_back")) {
				if(list.isEmpty()) {
					sb.append("-1").append("\n");
				}else {
					sb.append(list.pollLast()).append("\n");
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
