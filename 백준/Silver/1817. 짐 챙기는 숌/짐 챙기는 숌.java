

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		if(t == 0) {System.out.print(0); return;}
		st = new StringTokenizer(br.readLine());
		int count = 0;
		int tmp = 0;
		while(t --> 0) {
			int k = Integer.parseInt(st.nextToken());
			if(tmp == 0) tmp += k;
			else if(tmp + k > max) {
				count++;
				tmp = k;
			}else if(tmp + k == max) {
				count++;
				tmp = 0;
			}else {
				tmp += k;
			}
		}
		if(tmp != 0) count++;
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
