import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		int c = (int) Math.round((double)a * 0.15);
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(b);
		int d = a - 1;
		for(int i = 0; i < c; i++) {
			b[i] = 0;
			b[d] = 0;
			d--;
		}
		int sum = 0;
		for(int k : b) {
			sum += k;
		}
		sb.append((int) Math.round((double)sum / (a - (c * 2))));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
