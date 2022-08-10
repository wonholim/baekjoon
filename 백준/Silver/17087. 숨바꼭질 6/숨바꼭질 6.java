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
		int b = Integer.parseInt(st.nextToken());
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		int[] d = new int[a];
		for(int i = 0; i < a; i++) {
			d[i] = b - Integer.parseInt(st.nextToken());
		}
		for(int i = 1; i < a; i++) {
			sum = gcd(d[i - 1], d[i]);
			d[i] = sum;
		}
		if(a == 1) sum = d[0];
		sb.append(Math.abs(sum));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) { return a; }
		return gcd(b, a % b);
	}

}