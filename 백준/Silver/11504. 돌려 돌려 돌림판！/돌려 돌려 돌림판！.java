

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			String x = "";
			String y = "";
			String circle = "";
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				x += st.nextToken();
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) {
				y += st.nextToken();
			}
			int tmpX = Integer.parseInt(x);
			int tmpY = Integer.parseInt(y);
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < n; i++) {
				circle += st.nextToken();
			}
			circle += circle;
			int count = 0;
			int k = 0;
			for(int i = m; i < n * 2; i++) {
				if(k == n) break;
				if(Integer.parseInt(circle.substring(k, i)) >= tmpX && tmpY >= Integer.parseInt(circle.substring(k, i))) {
					count++;
				}
				k++;
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
