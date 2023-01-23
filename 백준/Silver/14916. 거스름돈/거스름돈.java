

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int k = Integer.parseInt(br.readLine());
		int five = 1;
		int min = 30000;
		if(k == 2 || k == 4) {
			System.out.println(k / 2);
			return;
		}
		while(true) {
			if(5 * five > k) break;
			if(k % 2 == 0) {
				min = Math.min(min, ((k) / 2));
			}
			int tmp = k - (5 * five);
			if(tmp % 2 != 0) {five++; continue;}
			min = Math.min(min, five + ((tmp) / 2));
			five++;
		}
		if(min != 30000) sb.append(min);
		else sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
