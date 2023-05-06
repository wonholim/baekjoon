
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
		StringTokenizer st;
		char[] c = br.readLine().toCharArray();
		boolean check = false;
		boolean m = false;
		for(int i = 0; i < c.length / 2; i++) {
			if(c[i] != c[c.length - 1 - i]) {
				check = true;
				break;
			}
		}
		int i;
		for(i = c.length - 1; i >= 0; i--) {
			if(c[0] != c[i]) {
				m = true;
				break;
			}
		}
		if(check) sb.append(c.length);
		else sb.append(m ? c.length - 1 : -1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
