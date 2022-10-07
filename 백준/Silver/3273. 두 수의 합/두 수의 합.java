import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b);
		int c = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < a; i++) {
			for(int j = i + 1; j < a; j++) {
				if(b[i] + b[j] < c) continue;
				else if(b[i] + b[j] == c) count++;
				else break;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
