

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		long n = Long.parseLong(br.readLine());
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long ap = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long bp = Long.parseLong(st.nextToken());
		long max = 0;
		long aaa = 0;
		long bbb = 0;
		for(int i = 0; i <= n / ap; i++) {
			long sum = 0;
			long bb = (n - (i * ap)) / bp;
			sum = (i * a) + (bb * b);
			if(max < sum) {
				aaa = i;
				bbb = bb;
				max = sum;
			}
		}
		sb.append(aaa + " " + bbb);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
