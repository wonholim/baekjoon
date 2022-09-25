import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int i = 1;
		while(a --> 0) {
			Set<Character> s = new HashSet<>();
			long b = Long.parseLong(br.readLine());
			if(b == 0) {sb.append("Case #" + i + ": INSOMNIA\n"); i++; continue;}
			int j = 1;
			while(s.size() != 10) {
				for(char c : Long.toString(b * j).toCharArray()) {
					s.add(c);
				}
				j++;
			}
			sb.append("Case #" + i + ": " + b * (j - 1) + "\n");
			i++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
