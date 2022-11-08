

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		if(n < 3) {System.out.println("possible"); return;}
		int p = Integer.parseInt(br.readLine());
		int c = (int) Math.ceil((double)n * p * 0.01);
		ArrayList<int[]> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new int[] {x, y}); // n개의 점 저장
		}
		for(int i = 0; i < 150; i++) {
			int count = 0;
			// 랜덤 점 생성
			int p1 = (int) (Math.random() * n);
			int p2 = (int) (Math.random() * n);
			while(p1 == p2) p2 = (int) (Math.random() * n);
			for(int[] g : list) {
				// 모든 점에 대해 랜덤점으로 시행
				if(CCW(g[0], g[1], list.get(p1)[0], list.get(p1)[1], list.get(p2)[0], list.get(p2)[1])) {
					count++;
				}
			}
			if(count >= c) {
				System.out.println("possible");
				return;
			}
		}
		sb.append("impossible");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean CCW(long x1, long y1, long x2, long y2, long x3, long y3) {
		// TODO Auto-generated method stub
		return (x1 * y2 + x2 * y3 + x3 * y1) == (x2 * y1 + x3 * y2 + x1 * y3);
	}

}
