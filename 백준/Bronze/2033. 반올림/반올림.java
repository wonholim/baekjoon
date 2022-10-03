import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		for(int i = a.length - 1; 0 < i; i--) {
			int b = Integer.parseInt(a[i]);
			if(b < 5) {
				a[i] = "0";
			}else {
				a[i] = "0";
				b = Integer.parseInt(a[i - 1]) + 1;
				a[i - 1] = Integer.toString(b);
			}
		}
		for(int i = 0; i < a.length; i++) {
			sb.append(a[i]);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
