
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static char[] c = {'a', 'e', 'i', 'o', 'u'};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while(true) {
			String line = br.readLine();
			if(line.equals("end")) break;
			boolean check = false;
			boolean mem = false;
			for(int i = 0; i < c.length; i++) {
				if(line.contains(c[i] + "")) {
					mem = true;
					break;
				}
			}
			if(!mem) check = true;
			char[] g = line.toCharArray();
			for(int i = 0; i < g.length - 2; i++) {
				int j = 0;
				int m = 0;
				for(int l = 0; l < 3; l++) {
					boolean jaum = false;
					for(int k = 0; k < c.length; k++) {
						if(g[i + l] == c[k]) {
							jaum = true;
							break;
						}
					}
					if(jaum) m++;
					else j++;
				}
				if(j == 3 || m == 3) {
					check = true;
					break;
				}
			}
			for(int i = 0; i < 26; i++) {
				char part = (char)(i + 'a');
				if(part == 'e' || part == 'o') continue;
				String three = part + "" + part;
				if(line.contains(three)) {
					check = true;
					break;
				}
			}
			if(!check) sb.append("<" + line + "> is acceptable.\n");
			else sb.append("<" + line + "> is not acceptable.\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
