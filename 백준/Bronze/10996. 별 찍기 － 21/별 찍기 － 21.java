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
		if(a == 1) {
			sb.append("*");
		}else {
			for(int i = 1; i <= a * 2; i++) {
				if(i % 2 != 0) {
					for(int j = 1; j <= a; j++) {
						if(j % 2 == 0) {
							sb.append(" ");
						}else {
							sb.append("*");
						}
					}
				}else {
					for(int j = 1; j <= a; j++) {
						if(j % 2 != 0) {
							sb.append(" ");
						}else {
							sb.append("*");
						}
					}
				}
				sb.append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
