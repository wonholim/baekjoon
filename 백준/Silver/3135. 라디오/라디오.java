
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
		int count = 0;
		int t = Integer.parseInt(br.readLine());
		int[] c = new int[t];
		int index = -1;
		int max = Math.abs(a - b);
		for(int i = 0; i < t; i++) {
			c[i] = Integer.parseInt(br.readLine());
			if(max > Math.abs(c[i] - b)) {
				max = Math.abs(c[i] - b);
				index = i;
			}
		}
		if(index == -1) sb.append(max);
		else sb.append(Math.abs(c[index] - b) + 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
