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
		String a = br.readLine();
		int p = 0;
		for(char c : a.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				p += c - 'a' + 1;
			}else {
				p += c - '&';
			}
		}
		for(int i = 2; i < p; i++) {
			if(p % i == 0) {
				System.out.println("It is not a prime word.");
				return;
			}
		}
		sb.append("It is a prime word.");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
