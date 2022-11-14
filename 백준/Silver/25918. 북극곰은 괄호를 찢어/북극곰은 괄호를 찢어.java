

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
		int a = Integer.parseInt(st.nextToken());
		int abs = 0;
		int max = 0;
		for(char c : br.readLine().toCharArray()) {
			if(c == '(') {
				abs++;
			}else {
				abs--;
			}
			max = Math.max(max, Math.abs(abs));
		}
		if(abs != 0) {
			sb.append(-1);
		}else {
			sb.append(max);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
