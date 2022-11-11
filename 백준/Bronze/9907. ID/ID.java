

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
		String[] g = br.readLine().split("");
		char[] c = new char[11];
		c[0] = 'J';
		c[1] = 'A';
		c[2] = 'B';
		c[3] = 'C';
		c[4] = 'D';
		c[5] = 'E';
		c[6] = 'F';
		c[7] = 'G';
		c[8] = 'H';
		c[9] = 'I';
		c[10] = 'Z';
		int sum = 0;
		sum += Integer.parseInt(g[0]) * 2;
		sum += Integer.parseInt(g[1]) * 7;
		sum += Integer.parseInt(g[2]) * 6;
		sum += Integer.parseInt(g[3]) * 5;
		sum += Integer.parseInt(g[4]) * 4;
		sum += Integer.parseInt(g[5]) * 3;
		sum += Integer.parseInt(g[6]) * 2;
		sum = sum % 11;
		sb.append(c[sum]);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
