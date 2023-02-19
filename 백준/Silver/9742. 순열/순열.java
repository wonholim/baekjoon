

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int count;
	static char[] c;
	static boolean[] d;
	static int n;
	static String find;
	static int x;
	static String l;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String line = "";
		while((line = br.readLine()) != null) {
			st = new StringTokenizer(line);
			l = st.nextToken();
			x = Integer.parseInt(st.nextToken());
			find = null;
			n = l.length();
			c = new char[n];
			d = new boolean[n];
			c = l.toCharArray();
			count = 0;
			BT(0);
			sb.append(l + " " + x + " = ");
			if(find == null) sb.append("No permutation");
			else sb.append(find);
			sb.append("\n");
		}
 		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(int e) {
		// TODO Auto-generated method stub
		if(count > x) return;
		if(e == n) {
			count++;
			if(count == x) {
				find = String.valueOf(c);
			}
		}else {
			for(int i = 0; i < n; i++) {
				if(!d[i]) {
					d[i] = true;
					c[e] = l.charAt(i);
					BT(e + 1);
					d[i] = false;
				}
			}
		}
	}

}
