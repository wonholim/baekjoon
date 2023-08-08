import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		while (n --> 0) {
			String line = br.readLine();
			int k = (int) Math.sqrt(line.length());
			int len = k - 1;
			for (int j = len; j >= 0; j--) {
				int tmp = j;
				for (int i = 0; i < k; i++) {
					sb.append(line.charAt(tmp));
					tmp += k;
				}
			}
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}