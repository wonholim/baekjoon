
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
		int g = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int a = g * p;
		int b = g + p * t;
		if(a == b) sb.append("0");
		else if(a > b) sb.append("2");
		else sb.append("1");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
