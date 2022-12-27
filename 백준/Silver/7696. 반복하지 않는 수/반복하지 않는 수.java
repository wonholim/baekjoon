

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
		int[] e = new int[1000001];
		int count = 1;
		int i = 1;
		boolean[] g;
		while(true) {
			if(count == 1000001) break;
			boolean check = false;
			int copy = i;
			g = new boolean[10];
			while(copy > 0) {
				if(g[copy % 10]) {
					check = true;
					break;
				}
				g[copy % 10] = true;
				copy /= 10;
			}
			i++;
			if(!check) {
				e[count] = i;
				count++;
			} 
			if(i % 100000 == 0) System.gc();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			sb.append(e[a] - 1 + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
