

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] robot = new int[3];
		robot[2] = 2;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			int k = Integer.parseInt(st.nextToken());
			if(line.equals("MOVE")) {
				if(robot[2] == 1) {
					robot[0] += k;
				}else if(robot[2] == 2){
					robot[1] += k;
				}else if(robot[2] == 3){
					robot[0] -= k;
				}else {
					robot[1] -= k;
				}
			}else {
				if(k == 0) {
					robot[2] -= 1;
					if(robot[2] == 0) robot[2] = 4;
				}else {
					robot[2] += 1;
					if(robot[2] == 5) robot[2] = 1;
				}
			}
			if(robot[0] < 0 || robot[1] < 0 || robot[0] > n|| robot[1] > n) {
				System.out.print(-1);
				return;
			}
		}
		sb.append(robot[1] + " " + robot[0]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
