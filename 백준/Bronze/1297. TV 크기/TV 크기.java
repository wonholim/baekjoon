

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
		int d = (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		double e = Math.sqrt((double)d / (Math.pow(h, 2) + Math.pow(w, 2)));
		sb.append((int)Math.floor(h * e) + " " + (int)Math.floor(w * e));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
