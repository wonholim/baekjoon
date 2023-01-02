

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> aa;
	static ArrayList<Integer> bb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		aa = new ArrayList<>();
		bb = new ArrayList<>();
		int n = Integer.parseInt(st.nextToken()) * 2;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		while(a --> 0) {
			aa.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		while(b --> 0) {
			bb.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(aa, Collections.reverseOrder());
		Collections.sort(bb, Collections.reverseOrder());
		int sum = 0;
		if((n / 2) % 2 != 0) {sum += aa.remove(0); n = n - 2;}
		while(n != 0) {
			if(aa.isEmpty() && !bb.isEmpty()) {
				sum += bb.get(0);
				n = n - 4;
				bb.remove(0);
			}else if(bb.isEmpty() && !aa.isEmpty()) {
				sum += aa.get(0);
				n = n - 2;
				aa.remove(0);
			}else if(!aa.isEmpty() && !bb.isEmpty()){
				if(n == 2) {
					sum += aa.remove(0);
					n = n - 2;
				}else if(n >= 4) {
					if(aa.size() >= 2 && aa.get(0) + aa.get(1) > bb.get(0)) {
						sum += aa.remove(0);
						sum += aa.remove(0);
						n = n - 4;
					}else {
						sum += bb.remove(0);
						n = n - 4;
					}
				}
			}else {
				break;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
