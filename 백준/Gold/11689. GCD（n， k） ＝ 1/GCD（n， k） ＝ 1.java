

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
		long a = Long.parseLong(st.nextToken());
		long cop = a;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				cop = cop - (cop / i);
				while(a % i == 0) {
					a = a / i;
				}
			}
		}
		sb.append(a > 1 ? cop - (cop / a) : cop);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
