import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int f = Integer.parseInt(br.readLine());
			int h = Integer.parseInt(br.readLine());
			int[] b = new int[h];
			int[] c = new int[h];
			c[0] = 1;
			for(int i = 1; i <= h; i++) {
				b[i - 1] = i;
			}
			int sum = 0;
			for(int i = 1; i < f; i++) {
				for(int j = 1; j < h; j++) {
					c[j] = b[j] + c[j - 1];
				}
				for(int k = 1; k < h; k++) {
					b[k] = c[k];
				}
			}
			if(f != 1) {
				for(int q : c) {
					sum += q;
				}
			}else {
				for(int q : b) {
					sum += q;
				}
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}