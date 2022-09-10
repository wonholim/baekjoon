import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		for(int j = 0; j < 1; j++) {
			for(int i = 0; i < a + 2; i++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < 1; j++) {
				sb.append("@");
			}
			for(int k = 0; k < a; k++) {
				sb.append(" ");
			}
			for(int j = 0; j < 1; j++) {
				sb.append("@");
			}
			sb.append("\n");
		}
		for(int j = 0; j < 1; j++) {
			for(int i = 0; i < a + 2; i++) {
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