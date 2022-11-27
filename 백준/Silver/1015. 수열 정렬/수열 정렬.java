

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
		int t = Integer.parseInt(br.readLine());
		int[] a = new int[t];
		int[] b = new int[t];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < t; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = a[i];
		}
		Arrays.sort(b);
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				if(a[i] == b[j]) {
					b[j] = -1;
					sb.append(j + " ");
					break;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
