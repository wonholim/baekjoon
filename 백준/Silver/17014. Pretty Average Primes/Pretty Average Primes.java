

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		boolean[] c = new boolean[3000001];
		for(int i = 2; i < 3000001; i++) {
			if(c[i]) continue;
			for(int j = 2 * i; j < 3000001; j = i + j) {
				c[j] = true;
			}
		}
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine()) * 2;
			int d = k / 2;
			int e = k / 2;
			while(true) {
				if(!c[d] && !c[e] && d + e == k) {
					sb.append(d + " " + e + "\n");
					break;
				}else {
					d--;
					e++;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
