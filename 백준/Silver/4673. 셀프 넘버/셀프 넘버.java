

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] a = new boolean[10000];
		for(int i = 1; i < 10000; i++) {
			int sum = i;
			int k = i;
			while(true) {
				if(k == 0) break;
				else {
					sum += k % 10;
					k /= 10;
				}
			}
			if(sum < 10000) a[sum] = true;
		}
		for(int i = 1; i < 10000; i++) {
			if(!a[i]) sb.append(i + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
