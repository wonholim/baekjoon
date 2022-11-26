
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int match;
	static int count;
	static int[] nums;
	static boolean[] v;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		match = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		nums = new int[n + 1];
		v = new boolean[n + 1];
		for(int i = 1; i < n + 1; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		recursive(1, 0);
		if(match != 0) sb.append(count);
		else sb.append(count - 1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int value) {
		// TODO Auto-generated method stub
		if(k == n + 1) {
			if(value == match) count++;
		}else {
			recursive(k + 1, value + nums[k]);
			recursive(k + 1, value);
		}
	}

}
