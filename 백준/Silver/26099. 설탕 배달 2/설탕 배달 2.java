

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
		long n = Long.parseLong(st.nextToken());
		if (n == 4 || n == 7) sb.append(-1);
		else if (n % 5 == 0) sb.append(n / 5);
		else if (n % 5 == 3 || n % 5 == 1) sb.append((n / 5) + 1);
		else sb.append((n / 5) + 2);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
