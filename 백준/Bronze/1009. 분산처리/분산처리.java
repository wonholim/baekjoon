import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			ArrayList<Integer> list = new ArrayList<>();
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(b % 10 == 0) { sb.append("10\n"); continue; }
			for(int i = 1; i <= 4; i++) {
				int pow = (int) Math.pow(b, i);
				pow = pow % 10;
				if(!list.contains(pow)) {
					list.add(pow);
				}else {
					break;
				}
			}
			int d = c % list.size() - 1;
			if(d < 0) {
				sb.append(list.get(list.size() - 1) + "\n");
			}else {
				sb.append(list.get(d) + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
