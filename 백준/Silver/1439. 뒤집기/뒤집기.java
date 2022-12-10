
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String g = br.readLine();
		String coin = "" + g.charAt(0);
		char c = g.charAt(0);
		for(int i = 1; i < g.length(); i++) {
			if(g.charAt(i) != c) {
				coin += g.charAt(i);
				c = g.charAt(i);
			}
		}
		int zCount = 0;
		int oCount = 0;
		for(char k : coin.toCharArray()) {
			if(k == '0') zCount++;
			else oCount++;
		}
		sb.append(Math.min(zCount, oCount));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
