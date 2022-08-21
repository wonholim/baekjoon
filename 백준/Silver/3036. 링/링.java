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
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i < a; i++) {
			int c = gcd(b[0], b[i]);
			sb.append(b[0] / c).append("/").append(b[i] / c).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if(j == 0) return i;
		return gcd(j , i % j);
	}

}
