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
		int[] c = new int[a];
		for(int i = 0; i < a; i++) c[i] = Integer.parseInt(br.readLine());
		int count = 0;
			for(int i = c.length - 1; 0 <= i; i--) {
				if(b >= c[i]) {
					count = count + (b / c[i]);
					b = b % c[i];
				}
			}
		sb.append(count).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
