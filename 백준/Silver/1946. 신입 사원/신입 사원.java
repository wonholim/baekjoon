

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] c = new int[n][2];
			for(int i = 0 ; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				c[i][0] = Integer.parseInt(st.nextToken());
				c[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(c, new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					return o1[0] - o2[0];
				}	
			});
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(c[i][1] <= c[0][1]) {
					count++;
					c[0][1] = c[i][1];
				}
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
