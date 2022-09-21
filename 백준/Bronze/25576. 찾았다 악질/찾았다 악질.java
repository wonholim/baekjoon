
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
		int a = Integer.parseInt(st.nextToken()) - 1;
		int check = 0;
		int count = 0;
		int b = Integer.parseInt(st.nextToken());
		int[] c = new int[b];
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < b; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for(int i = 0 ; i < b; i++) {
				sum += Math.abs(c[i] - Integer.parseInt(st.nextToken()));
			}
			if(sum > 2000) count++;
			else check++;
		}
		if(check <= count) sb.append("YES");
		else sb.append("NO");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}