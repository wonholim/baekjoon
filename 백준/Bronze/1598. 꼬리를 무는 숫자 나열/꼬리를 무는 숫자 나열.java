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
		int a = Integer.parseInt(st.nextToken()) - 1;
		int b = Integer.parseInt(st.nextToken()) - 1;
		if(a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int dis_a = a / 4 - 1;
		int dis_b = b / 4 - 1;
		int hei_a = a % 4;
		int hei_b = b % 4;
		sb.append((dis_b - dis_a) + Math.abs(hei_a - hei_b));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
