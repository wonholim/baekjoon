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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = 1;
		int e = 1;
		int g = 1;
		int count = 1;
		while(true) {
			if(d == 16) d = 1;
			if(e == 29) e = 1;
			if(g == 20) g = 1;
			if(a == d && b == e && c == g) break;
			d++;
			e++;
			g++;
			count++;
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
