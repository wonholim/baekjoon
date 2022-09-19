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
		String a = br.readLine();
		String[] b = br.readLine().split("");
		int i = 0;
		for(char c : a.toCharArray()) {
			char g;
			if(c != ' ') {
				g = (char) (c - (b[i].charAt(0) - 96));
				if(g < 97) g = (char) (g + 26);
				sb.append(g);
			}else {
				sb.append(" ");
			}
			i++;
			if(i == b.length) i = 0;

		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
