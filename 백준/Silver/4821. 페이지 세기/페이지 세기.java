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
		int a;
		while(true) {
			int sum = 0;
			a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			boolean[] last = new boolean[a + 1];
			String[] b = br.readLine().split(",");
			for(int i = 0; i < b.length; i++) {
				boolean check = false;
				for(char c : b[i].toCharArray()) {
					if(c == '-') {
						check = true;
						break;
					}
				}
				if(check) {continue;}
				else {
					int k = Integer.parseInt(b[i]);
					if(k > 0 && k <= a) {
						last[k] = true;
					}
				}
			}
			for(int i = 0; i < b.length; i++) {
				String[] d = b[i].split("-");
				if(d.length == 2) {
					int q = Integer.parseInt(d[0]);
					int w = Integer.parseInt(d[1]);
					if(w - q >= 0 && w > 0 && q > 0) {
						for(int k = q; k <= w; k++) {
							if(k <= a) {
								last[k] = true;
							}
						}
					}
				}
			}
			for(int i = 1; i <= a; i++) {
				if(last[i]) sum++;
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
