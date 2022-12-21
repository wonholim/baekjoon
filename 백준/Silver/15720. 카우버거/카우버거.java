

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		ArrayList<Integer> burger = new ArrayList<>();
		ArrayList<Integer> side = new ArrayList<>();
		ArrayList<Integer> juice = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			burger.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		while(b --> 0) {
			side.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		while(c --> 0) {
			juice.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(burger, Collections.reverseOrder());
		Collections.sort(side, Collections.reverseOrder());
		Collections.sort(juice, Collections.reverseOrder());
		int max = 0;
		int dis = 0;
		while(true) {
			if(burger.isEmpty() && side.isEmpty() && juice.isEmpty()) break;
			int count = 0;
			int sum = 0;
			if(!burger.isEmpty()) {
				int k = burger.remove(0);
				max += k;
				sum += k;
				count++;
			}
			if(!side.isEmpty()) {
				int k = side.remove(0);
				max += k;
				sum += k;
				count++;
			}
			if(!juice.isEmpty()) {
				int k = juice.remove(0);
				max += k;
				sum += k;
				count++;
			}
			if(count == 3) {
				sum = (int) (sum * 0.9);
			}
			dis += sum;
		}
		sb.append(max + "\n" + dis);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
