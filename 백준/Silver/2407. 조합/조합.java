import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		BigInteger[][] c = new BigInteger[101][101];
		for(int i = 1; i <= a; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					c[i][j] = BigInteger.ONE;
				}else {
					c[i][j] = c[i - 1][j - 1].add(c[i - 1][j]);
				}
			}
		}
		sb.append(c[a][b]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}