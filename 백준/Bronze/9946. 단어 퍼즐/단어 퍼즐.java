import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 1;
		while (true) {
			int[] ll = new int[26];
			int[] rr = new int[26];
			String l = br.readLine();
			String r = br.readLine();
			if (l.equals("END") && r.equals("END")) break;
			for (char c : l.toCharArray()) ll[c - 'a']++;
			for (char c : r.toCharArray()) rr[c - 'a']++;
			sb.append("Case " + n++ + ": ");
			boolean check = false;
			for(int i = 0; i < 26; i++) {
				if(ll[i] != rr[i]) {
					check = true;
					break;
				}
			}
			if(check) sb.append("different");
			else sb.append("same");
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
