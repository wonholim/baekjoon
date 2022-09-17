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
		int a = Integer.parseInt(br.readLine());
		for(int i = 1; i <= a; i++) {
			sb.append("Case #" + i + ": ");
			int f = Integer.parseInt(br.readLine());
			String h = br.readLine();
			for(int j = 0; j < f; j++) {
				String str = h.substring(j * 8, (j + 1) * 8);
				String st = "";
				for(char c : str.toCharArray()) {
					if(c == 'O') {
						st += 0;
					}else {
						st += 1;
					}
				}
				int d = Integer.valueOf(st, 2);
				sb.append((char) d);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
