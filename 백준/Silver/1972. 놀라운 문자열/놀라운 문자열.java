

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			String k = br.readLine();
			if(k.equals("*")) break;
			boolean check = false;
			outer : for(int i = 1; i < k.length(); i++) {
				Set<String> s = new HashSet<>();
				for(int j = i; j < k.length(); j++) {
					if(s.contains(k.charAt(j - i) + "" + k.charAt(j))) {
						check = true;
						break outer;
					}
					s.add(k.charAt(j - i) + "" + k.charAt(j));
				}
			}
			if(!check) sb.append(k + " is surprising.\n");
			else sb.append(k + " is NOT surprising.\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
