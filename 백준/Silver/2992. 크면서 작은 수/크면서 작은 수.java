
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static boolean[] d;
	static String[] c;
	static StringBuilder sb;
	static int x;
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		String k = br.readLine();
		x = Integer.parseInt(k);
		c = k.split("");
		d = new boolean[c.length];
		BT("", 0);
		if (ans == Integer.MAX_VALUE)
			sb.append(0);
		else
			sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void BT(String string, int q) {
		// TODO Auto-generated method stub
		if(q == c.length) {
			int k = Integer.parseInt(string);
			if(k > x) {
				ans = Math.min(ans, k);
			}
		}else {
			for(int i = 0; i < c.length; i++) {
				if(!d[i]) {
					d[i] = true;
					BT(string + c[i], q + 1);
					d[i] = false;
				}
			}
		}
	}


}
