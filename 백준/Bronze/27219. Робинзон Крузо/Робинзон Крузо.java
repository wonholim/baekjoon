

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int tmp = k / 5;
		int tmpp = k % 5;
		while(tmp --> 0) {
			sb.append("V");
		}
		while(tmpp --> 0) {
			sb.append("I");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
