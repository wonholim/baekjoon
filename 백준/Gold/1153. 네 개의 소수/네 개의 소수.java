

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		boolean[] b = new boolean[1000001];
		ArrayList<Integer> list = new ArrayList<>();
		b[0] = true;
		b[1] = true;
		for(int i = 2; i < 1000001; i++) {
			if(b[i]) continue;
			else list.add(i);
			for(int j = 2 * i; j < 1000001; j = j + i) {
				b[j] = true;
			}
		}
		if(a % 2 == 1) {
			a -= 5;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) >= a) break;
				for(int j = 0; j < list.size(); j++) {
					if(list.get(i) + list.get(j) < a) continue;
					else if(list.get(i) + list.get(j) > a) break;
					else {
						System.out.println("2 3 " + list.get(i) + " " + list.get(j));
						return;
					}
				}
			}
		}else {
			a -= 4;
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i) >= a) break;
				for(int j = 0; j < list.size(); j++) {
					if(list.get(i) + list.get(j) < a) continue;
					else if(list.get(i) + list.get(j) > a) break;
					else {
						System.out.println("2 2 " + list.get(i) + " " + list.get(j));
						return;
					}
				}
			}
		}
		sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
