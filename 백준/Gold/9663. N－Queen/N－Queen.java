

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb;
	static int n;
	static int count;
	static int[] col;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		col = new int[n + 1];
		count = 0;
		recursive(1);
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k) {
		// TODO Auto-generated method stub
		if(k == n + 1) {
			count++;
		}else {
			for(int i = 1; i <= n; i++) {
				// valid check
				boolean check = true;
				for(int j = 1; j <= k - 1; j++) {
					if(attack(k, i, j, col[j])) {
						check = false;
						break;
					}
				}
				if(check) {
					col[k] = i;
					recursive(k + 1);
					col[k] = 0;
				}
			}
		}
	}
	private static boolean attack(int r1, int c1, int r2, int c2) {
		// TODO Auto-generated method stub
		if(c1 == c2) return true;
		if(r1 - c1 == r2 - c2) return true;
		if(r1 + c1 == r2 + c2) return true;
		return false;
	}
}
