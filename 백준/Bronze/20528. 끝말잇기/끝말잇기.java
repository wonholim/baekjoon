
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Character> s = new HashSet<>();
		while(a --> 0) {
			String b = st.nextToken();
			s.add(b.charAt(0));
			s.add(b.charAt(b.length() - 1));
			if(s.size() > 1) {System.out.println(0); return;}
		}
		sb.append(1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}


