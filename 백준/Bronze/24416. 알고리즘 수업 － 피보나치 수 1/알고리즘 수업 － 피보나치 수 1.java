import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int[] b = new int[1000000];
	static int count = 1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		sb.append(pibo(a)).append(" ").append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static int pibo(int a) {
		// TODO Auto-generated method stub
		if(a == 1) return 1;
		else if(a == 0) return 0;
		else if(b[a] != 0) {count++; return b[a];}
		return b[a] = (pibo(a - 1) + pibo(a - 2));
	}

}