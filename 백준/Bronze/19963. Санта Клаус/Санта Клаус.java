

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
		boolean[] d = new boolean[a + 1];
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int sum = a - (b + c);
		st = new StringTokenizer(br.readLine());
		while(b --> 0) {
			int k = Integer.parseInt(st.nextToken());
			d[k] = true;
		}
		st = new StringTokenizer(br.readLine());
		while(c --> 0) {
			int k = Integer.parseInt(st.nextToken());
			d[k] = true;
		}
		sb.append(sum + "\n");
		for(int i = 1; i < a + 1; i++) {
			if(!d[i]) sb.append(i + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
