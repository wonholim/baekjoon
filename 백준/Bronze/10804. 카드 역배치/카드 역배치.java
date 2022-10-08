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
		int a = 10;
		int[] d = new int[20];
		for(int i = 0; i < 20; i++) {
			d[i] = i + 1;
		}
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if(b == c) continue;
			int e = (c - b) + 1;
			if(e == 1) {
				int f = d[c - 1];
				d[c - 1] = d[b - 1];
				d[b - 1] = f;
			}else {
				e = e / 2;
				while(e --> 0) {
					int f = d[c - 1];
					d[c - 1] = d[b - 1];
					d[b - 1] = f;
					c--;
					b++;
				}
			}
		}
		for(int i = 0; i < 20; i++) {
			sb.append(d[i] + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
