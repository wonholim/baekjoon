
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] c = new boolean[100001];
		c[0] = true;
		c[1] = true;
		for(int i = 2; i <= 100000; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j <= 100000; j = i + j) {
				c[j] = true;
			}
		}
		int sum = 0;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for(int i = a; i <= b; i++) {
			if(!c[i]) continue;
			else {
				int count = 0;
				int k = i;
				int dv = 2;
				while(true) {
					if(k == 1) break;
					if(k % dv == 0) {
						k = k / dv;
						count++;
						dv = 2;
					}else {
						dv++;
					}
				}
				if(!c[count]) sum++;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
