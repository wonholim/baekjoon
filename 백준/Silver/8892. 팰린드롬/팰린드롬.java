

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(st.nextToken());
		while (t --> 0) {
			int n = Integer.parseInt(br.readLine());
			String[] k = new String[n];
			for(int i = 0; i < n; i++) {
				k[i] = br.readLine();
			}
			boolean check = false;
			outer : for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					if(isP(k[i] + k[j])) {
						check = true;
						sb.append(k[i] + k[j] + "\n");
						break outer;
					}
					if(isP(k[j] + k[i])) {
						check = true;
						sb.append(k[j] + k[i] + "\n");
						break outer;
					}
				}
			}
			if(!check) sb.append("0\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean isP(String s) {
		// TODO Auto-generated method stub
		int tmp = s.length() - 1;
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(tmp)) return false;
			tmp--;
		}
		return true;
	}

}
