import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] c = new int[a + 1];
		for(int i = 1; i <= c.length - 1; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		b = new int[1000001];
		int max = 0;
		for(int i = 1; i <= c.length - 1; i++) {
			for(int j = 1; j <= i; j++) {
				b[i] = Math.max(b[i], b[i - j] + c[j]);
				if(b[i] > max) {
					max = b[i];
				}
			}
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
