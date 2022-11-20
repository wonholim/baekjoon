

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			int sum = 0;
			int k = Integer.parseInt(st.nextToken());
			for(int i = 1; i < k; i++) {
				if(k % i == 0) {
					sum += i;
				}
			}
			if(sum == k) sb.append("Perfect\n");
			else if(sum < k) sb.append("Deficient\n");
			else sb.append("Abundant\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
