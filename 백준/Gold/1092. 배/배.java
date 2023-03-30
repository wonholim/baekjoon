
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> in = new ArrayList<>();
		Integer[] c = new Integer[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) c[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(c, Collections.reverseOrder());
		int box = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < box; i++) in.add(Integer.parseInt(st.nextToken()));
		Collections.sort(in, Collections.reverseOrder());
		int count = 0;
		int tmp = 0;
		while(!in.isEmpty()) {
			tmp = box;
			int i = 0;
			int k = 0;
			while(i < n) {
				if(c[i] >= in.get(k)) {
					in.remove(k);
					box--;
					i++;
				}else {
					k++;
				}
				if(k == in.size()) break;
			}
			if(tmp == box) break;
			count++;
		}
		sb.append(tmp == box ? -1 : count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
