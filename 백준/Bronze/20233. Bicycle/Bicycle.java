
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int z = 0;
		int v = 0;
		if(m > 30) z += a + ((m - 30) * x) * 21;
		else z = a;
		if(m > 45) v += b + ((m - 45) * y) * 21;
		else v = b;
		sb.append(z + " " + v);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
