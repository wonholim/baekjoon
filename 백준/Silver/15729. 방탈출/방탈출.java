

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
		int t = Integer.parseInt(st.nextToken());
		boolean[] tmp = new boolean[t];
		boolean[] ori = new boolean[t];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			if(Integer.parseInt(st.nextToken()) == 1) ori[i] = true;
		}
		int count = 0;
		for(int i = 0; i < t; i++) {
			if(ori[i] != tmp[i]) {
				if(ori[i]) {
					tmp[i] = true;
					if(i + 2 < t) {
						tmp[i + 1] = !tmp[i + 1];
						tmp[i + 2] = !tmp[i + 2];
					}else if(i + 1 < t) {
						tmp[i + 1] = !tmp[i + 1];
					}
					count++;
				}else {
					tmp[i] = false;
					if(i + 2 < t) {
						tmp[i + 1] = !tmp[i + 1];
						tmp[i + 2] = !tmp[i + 2];
					}else if(i + 1 < t) {
						tmp[i + 1] = !tmp[i + 1];
					}
					count++;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
