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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		long k = Long.parseLong(st.nextToken());
		sb.append(go(k - 1));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static long go(long k) {
		// TODO Auto-generated method stub
		if(k == 0) return 0;
		else if(k == 1) return 1;
		else if(k % 2 == 0) return go(k / 2);
		else return 1 - go(k / 2);
	}

}
