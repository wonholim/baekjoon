

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		if(a == 1) sb.append(0);
		else {
			if(a * a % 2 == 0) sb.append((a * a) / 2);
			else sb.append(((a * a) / 2) + 1);
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
