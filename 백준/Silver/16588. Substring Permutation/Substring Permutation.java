import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> m = new HashMap<>();
		String a = br.readLine();
		int[] d = new int[26];
		boolean ch = false;
		for(char c : a.toCharArray()) {
			d[c - 97]++;
		}
		String b = br.readLine();
		for(char c : b.toCharArray()) {
			d[c - 97]--;
			if(d[c - 97] < 0) {
				ch = true;
				break;
			}
		}
		if(ch) sb.append("NO");
		else sb.append("YES");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}