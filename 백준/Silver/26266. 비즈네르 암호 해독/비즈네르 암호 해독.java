


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
		StringBuilder a = new StringBuilder();
		StringTokenizer st;
		String o = br.readLine();
		String c = br.readLine();
		for(int i = 0; i < o.length(); i++) {
			if((((c.charAt(i) + 26) - o.charAt(i)) % 26) == 0) a.append("Z");
			else a.append((char)('@' + (((c.charAt(i) + 26) - o.charAt(i)) % 26)));
		}
		String ans = a.toString();
		for(int i = 1; i < (ans.length() / 2) + 1; i++) {
			String n = ans.substring(0, i);
			int count = ans.length() / i;
			if(n.repeat(count).equals(ans)) {
				System.out.println(n);
				return;
			}
		}
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
