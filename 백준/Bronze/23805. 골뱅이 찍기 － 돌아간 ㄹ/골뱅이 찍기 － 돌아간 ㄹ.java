import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		for(int j = 0; j < a; j++) {
			for(int i = 0; i < a * 3; i++) {
				sb.append("@");
			}
			for(int i = 0; i < a; i++) {
				sb.append(" ");
			}
			for(int i = 0; i < a; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for(int j = 0; j < a * 3; j++) {
			for(int i = 0; i < a; i++) {
				sb.append("@");
			}
			for(int i = 0; i < a; i++) {
				sb.append(" ");
			}
			for(int i = 0; i < a; i++) {
				sb.append("@");
			}
			for(int i = 0; i < a; i++) {
				sb.append(" ");
			}
			for(int i = 0; i < a; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for(int j = 0; j < a; j++) {
			for(int i = 0; i < a; i++) {
				sb.append("@");
			}
			for(int i = 0; i < a; i++) {
				sb.append(" ");
			}
			for(int i = 0; i < a * 3; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}