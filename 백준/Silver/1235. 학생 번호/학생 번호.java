import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		String[] b = new String[a];
		for(int i = 0; i < a; i++) {
			b[i] = br.readLine();
		}
		int count = 1;
		while(true) {
			Set<String> s = new HashSet<>();
			for(int i = 0; i < a; i++) {
				s.add(b[i].substring(b[i].length()- count, b[i].length()));
			}
			if(s.size() == a) {
				break;
			}else {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
