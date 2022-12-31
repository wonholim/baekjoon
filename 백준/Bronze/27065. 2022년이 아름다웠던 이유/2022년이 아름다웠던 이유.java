

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			ArrayList<Integer> list = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			for(int i = 1; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			boolean check = false;
			if(sum > n) {
				for(int i = list.size() - 1; 0 <= i; i--) {
					int tmp = 0;
					for(int j = 1; j < list.get(i); j++) {
						if(list.get(i) % j == 0) {
							tmp += j;
						}
					}
					if(tmp > list.get(i)) {
						check = true;
						break;
					}
				}
				if(check) sb.append("BOJ 2022\n");
				else sb.append("Good Bye\n");
			}else {
				sb.append("BOJ 2022\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
