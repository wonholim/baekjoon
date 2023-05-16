
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static boolean[] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String line = "";
		while((line = br.readLine()) != null) {
			int n = Integer.parseInt(line);
			int p = (int) Math.pow(3, n);
			d = new boolean[p];
			partion(0, p);
			for(int i = 0; i < p; i++) {
				sb.append(d[i] ? ' ' : "-");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void partion(int s, int l) {
		// TODO Auto-generated method stub
		if(l == 1)  return;
		int k = l / 3;
		for(int i = s + k; i < s + 2 * k; i++) d[i] = true;
		partion(s, k);
		partion(s + 2 * k, k);
	}
}
