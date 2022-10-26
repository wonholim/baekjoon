

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());
		if((a * 3) + (b * 2) + c < (d * 3) + (e * 2) + f) {
			sb.append("B");
		}else if((a * 3) + (b * 2) + c > (d * 3) + (e * 2) + f) {
			sb.append("A");
		}else {
			sb.append("T");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
