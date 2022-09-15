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
		int b = a - 1;
		for(int j = 0; j < a; j++) {
			sb.append("*");
		}
		for(int j = 0; j < a * 2 - 3; j++) {
			sb.append(" ");
		}
		for(int j = 0; j < a; j++) {
			sb.append("*");
		}
		sb.append("\n");
		int c = 1;
		for(int i = 1; i < a - 1; i++) {
			for(int j = 0; j < c; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < a - 2; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < 2 * b - 3; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < a - 2; j++) {
				sb.append(" ");
			}
			sb.append("*");
			sb.append("\n");
			c++;
			b--;
		}
		for(int i = 0; i < c; i++) {
			sb.append(" ");
		}
		sb.append("*");
		for(int j = 0; j < a - 2; j++) {
			sb.append(" ");
		}
		sb.append("*");
		for(int j = 0; j < a - 2; j++) {
			sb.append(" ");
		}
		sb.append("*");
		sb.append("\n");
		c--;
		b++;
		for(int i = 1; i < a - 1; i++) {
			for(int j = c; 0 < j; j--) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < a - 2; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < 2 * b - 3; j++) {
				sb.append(" ");
			}
			sb.append("*");
			for(int j = 0; j < a - 2; j++) {
				sb.append(" ");
			}
			sb.append("*");
			sb.append("\n");
			c--;
			b++;
		}
		for(int j = 0; j < a; j++) {
			sb.append("*");
		}
		for(int j = 0; j < a * 2 - 3; j++) {
			sb.append(" ");
		}
		for(int j = 0; j < a; j++) {
			sb.append("*");
		}
		sb.append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
