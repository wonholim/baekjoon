
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
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
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int b = Integer.parseInt(br.readLine());
			Set<Integer> s = new HashSet<>();
			int[] c = new int[b];
			for(int i = 0; i < b; i++) {
				c[i] = Integer.parseInt(br.readLine());
			}
			int k = 1;
			while(true) {
				for(int i = 0; i < b; i++) {
					if(s.contains(c[i] % k)) {
						break;
					}else {
						s.add(c[i] % k);
					}
				}
				if(s.size() == b) break;
				else {s.clear(); k++;}
			}
			sb.append(k + "\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
