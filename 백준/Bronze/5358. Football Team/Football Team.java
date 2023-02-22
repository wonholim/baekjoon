
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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String k = "";
		while((k = br.readLine()) != null) {
			for(char c : k.toCharArray()) {
				if(c == 'i') {
					c = 'e';
				}else if(c == 'e') {
					c = 'i';
				}else if(c == 'I') {
					c = 'E';
				}else if(c == 'E') {
					c = 'I';
				}
				sb.append(c);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
