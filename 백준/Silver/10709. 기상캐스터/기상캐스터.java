

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
		char[][] c = new char[a][b];
		for(int i = 0; i < a; i++) {
			String d = br.readLine();
			for(int j = 0; j < b; j++) {
				if(d.charAt(j) == '.') {
					c[i][j] = '.';
				}else {
					c[i][j] = 'c';
				}
			}
		}
		for(int i = 0; i < a; i++) {
			boolean check = false;
			int count = 0;
			for(int j = 0; j < b; j++) {
				if(c[i][j] == 'c' && !check) {
					check = true;
					sb.append(0 + " ");
				}else if(c[i][j] == '.' && check) {
					count++;
					sb.append(count + " ");
				}else if(c[i][j] == '.' && !check) {
					check = false;
					sb.append(-1 + " ");
					count = 0;
				}else {
					check = true;
					count = 0;
					sb.append(0 + " ");
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
