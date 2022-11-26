

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb;
	static int n, max, min;
	static int[] nums, operators, order;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		nums = new int[n + 1];
		operators = new int[5];
		order = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < n + 1; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < 5; i++) {
			operators[i] = Integer.parseInt(st.nextToken());
		}
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		recursive(1, nums[1]);
		sb.append(max + "\n" + min);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int value) {
		// TODO Auto-generated method stub
		if(k == n) {
			max = Math.max(max, value);
			min = Math.min(min, value);
		}else {
			for(int i = 1; i <= 4; i++) {
				if(operators[i] >= 1) {
					operators[i]--;
					order[k] = i;
					recursive(k + 1, calculator(value, i, nums[k + 1]));
					operators[i]++;
					order[k] = 0;
				}
			}
		}
	}
	private static int calculator(int value, int i, int j) {
		// TODO Auto-generated method stub
		if(i == 1) return value + j;
		else if(i == 2) return value - j;
		else if(i == 3) return value * j;
		else return value / j;
	}

}
