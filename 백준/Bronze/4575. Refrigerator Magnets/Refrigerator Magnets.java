
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String a = br.readLine();
			boolean[] b = new boolean[26];
			if(a.equals("END")) break;
			boolean check = false;
			for(char c : a.toCharArray()) {
				if(c == ' ') continue;
				if(b[c - 'A']) {check = true; break;}
				else b[c - 'A'] = true;
			}
			if(check) continue;
			else sb.append(a + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
