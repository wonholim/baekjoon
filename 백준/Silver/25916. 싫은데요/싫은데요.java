

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
		int c = Integer.parseInt(st.nextToken());
		int[] b = new int[a];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		int start = 0;
		int last = 0;
		long sum = b[0];
		long max = 0;
		while(true) {
			if(last + 1 >= a) {
				break;
			}
			if(sum < c) {
				last++;
				sum += b[last];
				if(sum <= c) {
					max = Math.max(max, sum);
				}
			}else if(sum > c) {
				sum -= b[start];
				start++;
				if(sum <= c) {
					max = Math.max(max, sum);
				}
			}else if(sum == c) {
				max = c;
				break;
			}
			
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
