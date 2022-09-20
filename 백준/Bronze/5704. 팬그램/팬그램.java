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
		while(true){
			String b = br.readLine();
			if(b.equals("*")) break;
			int[] d = new int[26];
			boolean ch = false;
			for(char c : b.toCharArray()) {
				if(c != ' ') {
					d[c - 97]++;
				}
			}
			for(int i = 0 ; i < d.length; i++) {
				if(d[i] == 0) {
					ch = true;
					break;
				}
			}
			if(ch) {
				sb.append("N\n");
			}else {
				sb.append("Y\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}