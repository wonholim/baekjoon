

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
		for(int i = 0; i < 8; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(k != 0 && k != 1) {
				System.out.print("F");
				return;
			}
		}
		sb.append("S");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
