

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static class Numbers implements Comparable<Numbers>{
		int n;
		String name;
		public Numbers(int n, String name) {
			this.n = n;
			this.name = name;
		}
		@Override
		public int compareTo(Numbers o) {
			// TODO Auto-generated method stub
			return this.name.compareTo(o.name);
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Numbers> list = new ArrayList<>();
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		for(int i = x; i <= y; i++) {
			String name = "";
			for(char c : Integer.toString(i).toCharArray()) {
				if(c == '0') {
					name += "zero ";
				}else if(c == '1') {
					name += "one ";
				}else if(c == '2') {
					name += "two ";
				}else if(c == '3') {
					name += "three ";
				}else if(c == '4') {
					name += "four ";
				}else if(c == '5') {
					name += "five ";
				}else if(c == '6') {
					name += "six ";
				}else if(c == '7') {
					name += "seven ";
				}else if(c == '8') {
					name += "eight ";
				}else if(c == '9') {
					name += "nine ";
				}
			}
			list.add(new Numbers(i, name));
		}
		Collections.sort(list);
		int count = 1;
		for(Numbers i : list) {
			if(count == 10) {
				sb.append(i.n + "\n");
				count = 1;
			}else {
				count++;
				sb.append(i.n + " ");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
