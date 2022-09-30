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
		while(a --> 0) {
			String[] b = br.readLine().split("");
			for(int i = b.length - 1; 0 < i; i--) {
				int j = Integer.parseInt(b[i]);
				if(j >= 5) {
					b[i] = "0";
					b[i - 1] = String.valueOf(Integer.parseInt(b[i - 1]) + 1);
				}else {
					b[i] = "0";
				}
			}
			for(int i = 0; i < b.length; i++) {
				sb.append(b[i]);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
