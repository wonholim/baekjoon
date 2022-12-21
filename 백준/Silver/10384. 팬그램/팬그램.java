

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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int j = 1;
		while(t --> 0) {
			String line = br.readLine().replaceAll("[^a-zA-Z]", "");
			line = line.toLowerCase();
			int[] d = new int[26];
			for(char c : line.toCharArray()) {
				d[c - 'a']++;
			}
			int min = 27;
			for(int i = 0; i < 26; i++) {
				if(d[i] < min) {
					min = d[i];
				}
			}
			sb.append("Case " + j + ": ");
			if(min == 0) {
				sb.append("Not a pangram\n");
			}else if(min == 1) {
				sb.append("Pangram!\n");
			}else if(min == 2){
				sb.append("Double pangram!!\n");
			}else {
				sb.append("Triple pangram!!!\n");
			}
			j++;
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
