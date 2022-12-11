

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int size = Integer.parseInt(st.nextToken()) - 1;
		int t = Integer.parseInt(br.readLine());
		int box = size + 1;
		int count = 0;
		while(t --> 0) {
			int apple = Integer.parseInt(br.readLine());
			if(box - size <= apple && apple <= box) continue;
			while(true) {
				if(box - size <= apple && apple <= box) break;
				if(apple < box - size) box--;
				else if(apple > box) box++;
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
