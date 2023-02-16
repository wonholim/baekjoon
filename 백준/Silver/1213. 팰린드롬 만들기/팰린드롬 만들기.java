
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		char[] a = br.readLine().toCharArray();
		int[] c = new int[26];
		Arrays.sort(a);
		for(int i = 0; i < a.length; i++) {
			c[a[i] - 'A']++;
		}
		char oddChar = 0;
		int len = a.length / 2;
		int odd = 0;
		for(int i = 0; i < 26; i++) {
			if(c[i] == 0) continue;
			else if(c[i] % 2 != 0) {
				oddChar = (char)(i + 'A');
				odd++;
			}
		}
		if(odd > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		String p = "";
		for (int i = 0; i < 26; i++) {
			if (c[i] == 0)
				continue;
			else {
				int tmp = c[i] / 2;
				while (tmp-- > 0) {
					p += (char) (i + 'A');
				}
			}
		}
		StringBuilder sb1 = new StringBuilder();
		sb1.append(p);
		if(odd == 1) sb.append(p + oddChar + sb1.reverse());
		else sb.append(p + sb1.reverse());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
