
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		Set<String> s = new HashSet<>();
		for(int i = 0; i < a.length(); i++) {
			int b = 0;
			int c = i + 1;
			while(c <= a.length()) {
				s.add(a.substring(b, c));
				b++;
				c++;
			}
		}
		sb.append(s.size());
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
