import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		Set<String> s = new HashSet<>();
		while(a --> 0) {
			String c = br.readLine();
			char[] b = c.toCharArray();
			Arrays.sort(b);
			String d = new String(b);
			s.add(d);
			
		}
		sb.append(s.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
