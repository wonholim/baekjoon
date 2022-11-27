

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[][] nums;
	static int min;
	static boolean[] v;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		nums = new int[n + 1][n + 1];
		v = new boolean[n + 1];
		for(int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j < n + 1; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = Integer.MAX_VALUE;
		recursive(1, 0);
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int point) {
		// TODO Auto-generated method stub
		if(point == n / 2) {
			int value = calculator();
			min = Math.min(min, value);
			return;
		}else {
			for(int i = k; i <= n; i++) {
				if(!v[i]) {
					v[i] = true;
					recursive(i + 1, point + 1);
					v[i] = false;
				}
			}
		}
	}
	private static int calculator() {
		// TODO Auto-generated method stub
		int start = 0;
		int link = 0;
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j <= n; j++) {
				if(v[i] && v[j]) {
					start += (nums[i][j] + nums[j][i]);
				}else if(!v[i] && !v[j]){
					link += (nums[i][j] + nums[j][i]);
				}
			}
		}
		return Math.abs(start - link);
	}
}
