
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String k = br.readLine();
		String[] g = k.split("");
		int count = 0;
		for(char c : k.toCharArray()) {
			count += c - '0';
		}
		if(count % 3 != 0 || !k.contains("0")) {
			System.out.print(-1);
			return;
		}
		Arrays.sort(g, Collections.reverseOrder());
		for(String q : g) {
			sb.append(q);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
