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
		int a = Integer.parseInt(br.readLine());
		while(a --> 0){
			st = new StringTokenizer(br.readLine());
			String b = st.nextToken();
			String e = st.nextToken();
			if(b.length() != e.length()) {sb.append(b + " & " + e + " are NOT anagrams.\n"); continue;}
			int[] d = new int[26];
			boolean ch = false;
			for(char c : b.toCharArray()) {
				d[c - 97]++;
			}
			for(char c : e.toCharArray()) {
				d[c - 97]--;
				if(d[c - 97] < 0) {
					ch = true;
					break;
				}
			}
			if(ch) {
				sb.append(b + " & " + e + " are NOT anagrams.\n");
			}else {
				sb.append(b + " & " + e + " are anagrams.\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}

