

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int[] c = new int[367];
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int i = x; i <= y; i++) {
				c[i]++;
			}
		}
		int sum = 0;
		int max = 0;
		boolean check = false;
		int s = 0;
		for(int i = 1; i <= 366; i++) {
			if(!check && c[i] != 0) {
				check = true;
				s = i;
				max = c[i];
			}else if(check && c[i] != 0) {
				max = Math.max(max, c[i]);
			}else if(check && c[i] == 0) {
				check = false;
				sum += (i - s) * max;
				max = 0;
				s = 0;
			}else {
				continue;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
