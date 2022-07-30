import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		Deque<Integer> q = new LinkedList<>();
		for(int i = 1; i <= a; i++) {
			q.offer(i);
		}
		int count = 0;
		int tmp = 1;
		boolean reverse = false;
		while(!q.isEmpty()) {
			if(count == c) {
				count = 0;
				if(reverse == false) {
					reverse = true;
				}else {
					reverse = false;
				}
			}
			if(reverse == true) {
				if(tmp == b) {
					tmp = 1;
					count++;
					sb.append(q.pollLast()).append("\n");
				}else {
					tmp++;
					q.offerFirst(q.pollLast());
				}
			}else{
				if(tmp == b) {
					tmp = 1;
					count++;
					sb.append(q.pollFirst()).append("\n");
				}else {
					tmp++;
					q.offerLast(q.pollFirst());
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}