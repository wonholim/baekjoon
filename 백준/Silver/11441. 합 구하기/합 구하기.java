

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	/* 합 구하기
	 * 누적합 배열로 미리 각 원소들의 누적합을 구한다.
	 * 결국 구하자고 하는 값은 배열의 연속 합이기에..
	 * 누적합에서 구간이전의 누적합을 빼주게된다면, 구간의 합이 나오게 된다.
	 * 논리
	 * */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		int[] prefix = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		prefix[0] = c[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + c[i];
		}
		int t = Integer.parseInt(br.readLine());
		// 10 30 60 100 150
		// 1 3 -> 1일때는 j의 값만 취급
		// 2 4 -> prefix[4 - 1] - prefix[2 - 2] = 90;
		// 3 5 -> prefix[5 - 1] - prefix[3 - 2] = 120;
		// 점화식 : prefix[j - 1] - prefix[i - 2];
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			if(i == 0) sb.append(prefix[j] + "\n");
			else sb.append((prefix[j] - prefix[i - 1])+ "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
