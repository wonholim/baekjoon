import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] b = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b);
		for(int i : b) {
			sb = sb.append(i).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
