
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] a = new String[n];
		for(int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}
		Set<Character> s = new HashSet<>();
		boolean[] d = new boolean[n];
		char[] c = a[0].toCharArray();
		char[] ca = new char[26];
		for(char t : c) ca[t - 'A']++;
		for (int j = 1; j < n; j++) {
			char[] g = a[j].toCharArray();
			if (Math.abs(c.length - g.length) > 1) continue;
			char[] ga = new char[26];
			for(char t : g) ga[t - 'A']++;
			int count = 0;
			boolean check = false;
			for(int i = 0; i < 26; i++) {
				if(Math.abs(ca[i] - ga[i]) > 1) {
					check = true;
					break;
				}else if(Math.abs(ca[i] - ga[i]) == 1) count++;
			}
			if(check) continue;
			if((double)count / 2 > 1) continue;
			d[j] = true;
		}
		int cnt = 0;
		for(boolean k : d) if(k) cnt++;
		sb.append(cnt);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
