

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int[] c;
	static int[] v;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			n = Integer.parseInt(br.readLine());
			recursive(1, 1, "1");
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void recursive(int k, int count, String value) {
		// TODO Auto-generated method stub
		if(count == n) {
			ArrayList<Integer> list = new ArrayList<>();
			String tmp = value.replaceAll(" ", "");
			for(char c : tmp.toCharArray()) {
				if(c == '+') list.add(1);
				else if(c == '-') list.add(2);
			}
			String[] result = tmp.split("[-, +]");
			int sum = Integer.parseInt(result[0]);
			int j = 0;
			for(int i = 1; i < result.length; i++) {
				if(list.get(j) == 1) {
					sum += Integer.parseInt(result[i]);
				}else if(list.get(j) == 2){
					sum -= Integer.parseInt(result[i]);
				}
				j++;
			}
			if(sum == 0) sb.append(value + "\n");
		}else {
			recursive(k + 1, count + 1, value + " " + (k + 1));
			recursive(k + 1, count + 1, value + "+" + (k + 1));
			recursive(k + 1, count + 1, value + "-" + (k + 1));
		}
	}
}
