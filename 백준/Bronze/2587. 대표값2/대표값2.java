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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] a = new int[5];
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum += a[i];
		}
		Arrays.sort(a);
		sb.append(sum / 5 + "\n" + a[2]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}