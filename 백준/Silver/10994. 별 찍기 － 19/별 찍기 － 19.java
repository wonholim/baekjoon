import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
		static char[][] c;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		if(a == 1) { sb.append("*");}
		else {
			int b = 1;
			for(int i = 1; i < a; i++) {b = b + 4;}
			c = new char[b][b];
			draw(0, b);
			for(int i = 0; i < b; i++) {
				for(int j = 0; j < b; j++) {
					if(c[i][j] != 0) sb.append("*");
					else sb.append(" ");
				}
				sb.append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static int draw(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 1) return 0;
		for(int i = a; i < b; i++) {
			for(int j = a; j < b; j++) {
				if(i == a || i == b - 1) {
					c[i][j] = '*';
				}
				if(j == a || j == b - 1) {
					c[i][j] = '*';
				}
			}
		}
		return draw(a + 2, b - 2);
	}

}
