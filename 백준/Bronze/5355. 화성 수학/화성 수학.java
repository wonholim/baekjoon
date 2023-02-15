

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
		while(t --> 0) {
			String[] k = br.readLine().split(" ");
			double a = Double.parseDouble(k[0]);
			for(int i = 1; i < k.length; i++) {
				if(k[i].equals("#")) {
					a -= 7;
				}else if(k[i].equals("@")) {
					a *= 3;
				}else if(k[i].equals("%")) {
					a += 5;
				}
			}
			sb.append(String.format("%.2f", a) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
