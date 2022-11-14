

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		String k = "";
		for(int i = 0; i < a.length; i++) {
			k += a[i];
		}
		if(k.equals("1")) {System.out.print("no"); return;}
		long b = Long.parseLong(k);
		for(int i = 2; i <= Math.sqrt(b); i++) {
			if(b % i == 0) {
				System.out.print("no");
				return;
			}
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i].equals("6")) a[i] = "9";
			else if(a[i].equals("9")) a[i] = "6";
			else if(a[i].equals("3") || a[i].equals("4") || a[i].equals("7")) {
				System.out.print("no");
				return;
			}
		}
		String g = "";
		for(int i = a.length - 1; 0 <= i; i--) {
			g += a[i];
		}
		long c = Long.parseLong(g);
		for(int i = 2; i <= Math.sqrt(c); i++) {
			if(c % i == 0) {
				System.out.print("no");
				return;
			}
		}
		sb.append("yes");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
