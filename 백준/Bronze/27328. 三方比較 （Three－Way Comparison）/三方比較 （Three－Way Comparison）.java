

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
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		if(a > b) sb.append(1);
		else if(a < b) sb.append(-1);
		else sb.append(0);
		
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
