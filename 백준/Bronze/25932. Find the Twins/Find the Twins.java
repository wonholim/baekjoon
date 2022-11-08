
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			int mack = 0;
			int zack = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 10; i++) {
				int b = Integer.parseInt(st.nextToken());
				sb.append(b + " ");
				if(b == 18) {
					mack++;
				}else if(b == 17) {
					zack++;
				}
			}
			sb.append("\n");
			if(mack == 0 && zack == 0) {
				sb.append("none\n\n");
			}else if(mack > zack) {
				sb.append("mack\n\n");
			}else if(mack < zack) {
				sb.append("zack\n\n");
			}else {
				sb.append("both\n\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
