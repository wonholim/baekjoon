import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] b;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		b = new int[11];
		b[1] = 0;
		b[2] = 1;
		b[3] = 3;
		b[4] = 6;
		b[5] = 10;
		b[6] = 15;
		b[7] = 21;
		b[8] = 28;
		b[9] = 36;
		b[10] = 45;
		sb.append(b[a]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
