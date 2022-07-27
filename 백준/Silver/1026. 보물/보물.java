import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		Integer [] b = new Integer[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		int[] c = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(c);
		Arrays.sort(b, Collections.reverseOrder());
		int sum = 0;
		for(int i = 0; i < a; i++) {
			sum = sum + (b[i] * c[i]);
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}