
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	/*
	 * 접근 방법, 공주님의 정원은 3월 1일 부터, 11월 30일 까지 한 가지의 꽃이피어야한다.
	 * 날짜를 숫자로 바꾸는 정수론 방법을 이용한다.
	 * 각각의 날짜를 바꿔주고, 정렬해 준다.
	 * 정렬 후 더할 때, 수치가 작거나 같을 때만 더할 수 있으며, 그 이외는 0을 출력한다.
	 * 모든 꽃을 더한게 11월 30일까지의 값보다 작다면 그것 또한 0출력한다.
	 * 킵 
	 * */
	static class Day implements Comparable<Day> {
		int s;
		int e;
		public Day(int s, int e) {
			this.s = s;
			this.e = e;
		}
		public int compareTo(Day o1) {
			if(o1.s == this.s) {
				return this.e - o1.e;
			}
			return this.s - o1.s;
		}
		
	}
	static ArrayList<Day> list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			int mm = Integer.parseInt(st.nextToken());
			int dd = Integer.parseInt(st.nextToken());
			list.add(new Day(m * 100 + d, mm * 100 + dd));
		}
		Collections.sort(list);
		int count = 0;
		int start = 301;
		int end = 1201;
		int i = 0;
		int max = 0;
		while(start < end) {
			boolean check = false;
			for(int j = i; j < list.size(); j++) {
				Day tmp = list.get(j);
				if(tmp.s <= start) {
					if(max < tmp.e) {
						max = tmp.e;
						check = true;
						i = j + 1;
					}
				}else {
					break;
				}
			}
			if(check) {
				start = max;
				count++;
			}else {
				break;
			}
		}
		sb.append(start >= 1201 ? count : 0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
