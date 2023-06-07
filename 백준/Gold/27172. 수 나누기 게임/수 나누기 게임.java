
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		boolean[] d = new boolean[1000001];
		int[] c = new int[1000001];
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			list.add(k);
			d[k] = true;
		}
		for(int i = 1; i < c.length; i++) {
			if(!d[i]) continue;
			for(int j = i; j < c.length; j += i) {
				if(!d[j]) continue;
				if(j % i == 0) {
					c[i]++; c[j]--;
				}
			}
		}
		for(int k : list) {
			sb.append(c[k] + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
