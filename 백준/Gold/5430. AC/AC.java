import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			Deque<String> d = new ArrayDeque<>();
			String b = br.readLine();
			int c = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), "[],");
			for(int i = 0; i < c; i++) {
				d.offerLast(st.nextToken());
			}
			boolean reverse = false;
			boolean gongbaek = false;
			int count = 0;
			for(char k : b.toCharArray()) {
				if(d.isEmpty()) {gongbaek = true;}
				if(k == 'R') {
					if(reverse) {
						reverse = false;
					}else {
						reverse = true;
					}
				}else if(k == 'D' && !d.isEmpty()) {
					if(!reverse) {
						d.pollFirst();
						if(d.isEmpty()) {gongbaek = true;}
					}else {
						d.pollLast();
						if(d.isEmpty()) {gongbaek = true;}
					}
				}else if(k == 'D' && gongbaek) {
					sb.append("error\n");
					gongbaek = false;
					break;
				}
			}
			
			if(!d.isEmpty()) sb.append("[");
			while(!d.isEmpty()) {
				if(!reverse) {
					if(d.size() == 1) {
						sb.append(d.pollFirst()).append("]").append("\n");
					}else {
						sb.append(d.pollFirst()).append(",");
					}
				}else {
					if(d.size() == 1) {
						sb.append(d.pollLast()).append("]").append("\n");
					}else {
						sb.append(d.pollLast()).append(",");
					}
				}
			}
			if(gongbaek) sb.append("[]\n");
			
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
