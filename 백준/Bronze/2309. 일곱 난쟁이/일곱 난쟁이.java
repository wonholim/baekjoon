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
		int[] a = new int[9];
		boolean[] b = new boolean[9];
		boolean check = false;
		int sum = 0;
		int ssum = 0;
		for(int i = 0 ; i < 9; i++) {
			a[i] = Integer.parseInt(br.readLine());
			b[i] = true;
			sum += a[i];
		}
		ssum = sum;
		Arrays.sort(a);
		for(int i = 0; i < 8; i++) {
			sum = ssum - a[i];
			for(int j = i + 1; j < 9; j++) {
				sum -= a[j];
				if(sum == 100) {
					b[i] = false;
					b[j] = false;
					check = true;
					break;
				}else {
					sum = ssum - a[i];
				}
			}
			if(check) break;
		}
		for(int i = 0; i < 9; i++) {
			if(b[i]) {
				sb.append(a[i] + "\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}