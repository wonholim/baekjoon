

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
		int[] b = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		
		if(b[0] == b[1] && b[1] == b[2]) sb.append("*");
		else if(b[0] == b[1]) sb.append("C");
		else if(b[0] == b[2]) sb.append("B");
		else sb.append("A");
		
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
