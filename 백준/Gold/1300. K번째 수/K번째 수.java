import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		long c = 1;
		long d = b;
		long sum = 0;
		while(c <= d) {
			long e = (c + d) / 2;
			long f = 0;
			for(int i = 0; i < a; i++) {
				f += Math.min(e / (i + 1), a);
			}
			if(f >= b) {
				sum = e;
				d = e - 1;
			}else {
				c = e + 1;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
