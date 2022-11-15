

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String[] g = br.readLine().split("");
		int j = g.length - 1;
		for(int k = 0; k < g.length / 2; k++) {
			if(!g[k].equals(g[j])) {
				System.out.println("false");
				return;
			}
			j--;
		}
		sb.append("true");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
