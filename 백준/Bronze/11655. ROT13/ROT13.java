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
			String a = br.readLine();
			for(char c : a.toCharArray()) {
				int k = (int)c;
				if(k < 123 && k > 96) {
					k = k + 13;
					if(k > 122) {
						k = k - 122;
						k = 96 + k;
					}
				}else if(k > 64 && k < 91) {
					k = k + 13;
					if(k > 90) {
						k = k - 90;
						k = 64 + k;
					}
				}else if(k == 32) {
					sb.append(" ");
					continue;
				}
				sb.append((char)k);
			}
			sb.append(" ");
		sb.deleteCharAt(sb.length() -1);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}