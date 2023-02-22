

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
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		st = new StringTokenizer(br.readLine());
		int max = 0 ;
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			max = Math.max(c[i], max);
		}
		int i = 0;
		int left = 0;
		int right = 0;
		for(; i < n; i++) {
			if(c[i] == max) break;
			left += c[i];
		}
		i++;
		for(; i < n; i++) {
			right += c[i];
		}
		sb.append(left + "\n" + right); 
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
