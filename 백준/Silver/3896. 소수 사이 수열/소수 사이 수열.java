
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] b = new boolean[1299710];
		for(int i = 2; i < b.length; i++) {
			if(b[i]) continue;
			for(int j = 2 * i; j < b.length; j = i + j) {
				b[j] = true;
			}
		}
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int c = Integer.parseInt(br.readLine());
			int d = c;
			int e = c;
			if(!b[c]) {sb.append(0 + "\n"); continue;}
			while(true) {
				if(!b[d]) break;
				else d--;
			}
			while(true) {
				if(!b[e]) break;
				else e++;
			}
			sb.append(e - d + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
