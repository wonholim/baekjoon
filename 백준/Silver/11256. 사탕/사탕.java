

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			int candy = Integer.parseInt(st.nextToken());
			int boxes = Integer.parseInt(st.nextToken());
			Integer[] box = new Integer[boxes];
			for(int i = 0; i < boxes; i++) {
				st = new StringTokenizer(br.readLine());
				box[i] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			Arrays.sort(box, Collections.reverseOrder());
			int count = 0;
			for(int i = 0; i < boxes; i++) {
				count++;
				candy -= box[i];
				if(candy <= 0) break;
			}
			sb.append(count + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
