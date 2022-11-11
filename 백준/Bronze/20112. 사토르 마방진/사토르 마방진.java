

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		char[][] b = new char[a][a];
		for(int i = 0; i < a; i++) {
			String g = br.readLine();
			for(int j = 0; j < a; j++) {
				b[i][j] = g.charAt(j);
			}
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				if(i != j) {
					if(b[i][j] != b[j][i]) {
						System.out.println("NO");
						return;
					}
				}
			}
		}
		sb.append("YES");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
