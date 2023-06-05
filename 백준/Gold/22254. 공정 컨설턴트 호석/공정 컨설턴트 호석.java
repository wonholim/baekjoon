
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static int[] c;
	static int n;
	static int x;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		c = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int l = 1;
		int r = n;
		while(l <= r) {
			int mid = (l + r) / 2;
			
			if(determination(mid)) {
				r = mid - 1;
			}else {
				l = mid + 1;
			}
		}
		sb.append(l);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean determination(int mid) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 1; i <= mid; i++) {
			pq.offer(0);
		}
		for(int i = 1; i <= n; i++) {
			if(pq.peek() + c[i] > x) return false;
			else pq.offer(pq.poll() + c[i]);
		}
		return true;
	}

}
