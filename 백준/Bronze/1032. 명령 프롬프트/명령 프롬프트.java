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
		int a = Integer.parseInt(br.readLine()) - 1;
		String b = br.readLine();
		char[] c = new char[b.length()];
		for(int i = 0; i < b.length(); i++) {
			c[i] = b.charAt(i);
		}
		while(a --> 0) {
			String d = br.readLine();
			for(int i = 0; i < d.length(); i++) {
				if(c[i] == d.charAt(i)) {
					continue;
				}else {
					c[i] = '?';
				}
			}
		}
		for(char g : c) {
			sb.append(g);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
