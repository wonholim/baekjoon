

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(br.readLine());
		long b =  Long.parseLong(br.readLine());
		long c = Long.parseLong(br.readLine());
		long d = a * b * c;
		int[] e = new int[10];
		for(char g : Long.toString(d).toCharArray()) {
			e[g - '0']++;
		}
		for(int k : e) {
			sb.append(k +"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
