
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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Set<String> s = new HashSet<>();
		st.nextToken();
		String[] c = br.readLine().split(" ");
		for(int i = 0; i < c.length; i++) {
			if(c[i].length() < 6) continue;
			if(c[i].substring(c[i].length() - 6, c[i].length()).equals("Cheese")) s.add(c[i]);
		}
		sb.append(s.size() > 3 ? "yummy" : "sad");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
