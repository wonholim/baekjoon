

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Character> list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		String sex = br.readLine();
		list = new ArrayList<>();
		for(char c : sex.toCharArray()) {
			list.add(c);
		}
		int m = 0;
		int w = 0;
		while(!list.isEmpty()) {
				if(m > w) {
					if(list.get(0) == 'W') {
						w++;
						list.remove(0);
					}else {
						
						if(list.size() > 1 && list.get(1) == 'W') {
							w++;
							list.remove(1);
						}else {
							if(Math.abs(m - w) == k) break;
							m++;
							list.remove(0);
						}
					}
				}else if(m < w) {
					if(list.get(0) == 'M') {
						m++;
						list.remove(0);
					}else {
						if(list.size() > 1 && list.get(1) == 'M') {
							m++;
							list.remove(1);
						}else {
							if(Math.abs(m - w) == k) break;
							w++;
							list.remove(0);
						}
					}
				}else if(m == w){
					if(list.get(0) == 'W') {
						list.remove(0);
						w++;
					}else {
						list.remove(0);
						m++;
					}
				}
		}
		sb.append(m + w);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
