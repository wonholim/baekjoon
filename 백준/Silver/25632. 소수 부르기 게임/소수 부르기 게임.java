
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
		boolean[] q = new boolean[1001];
		for(int i = 2; i < 1001; i++) {
			if(q[i]) continue;
			for(int j = 2 * i; j < 1001; j = j + i) {
				q[j] = true;
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int yj = 0;
		int yt = 0;
		boolean[] w = new boolean[1001];
		for(int i = a; i <= b; i++) {
			if(!q[i]) {w[i] = true; yt++;}
		}
		for(int i = c; i <= d; i++) {
			if(!q[i]) {w[i] = true; yj++;}
		}
		if(yj == yt) {
			int count = 0;
			for(int i = 2; i <= 1000; i++) {
				if(w[i]) count++;
			}
			if(count % 2 == 0) {
				sb.append("yj");
			}else {
				sb.append("yt");
			}
		}else {
			if(yt > yj) {
				sb.append("yt");
			}else{
				sb.append("yj");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
