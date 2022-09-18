import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int d = a;
		double sum = 0;
		while(a --> 0) {
			String b = br.readLine();
			String g = "";
			for(char c : b.toCharArray()) {
				if(c == '0' || c == '6') {
					g += 9;
				}else {
					g += c;
				}
			}
			int k = Integer.parseInt(g);
			if(k > 100) {
				sum += 100;
			}else {
				sum += k;
			}
		}
		sb.append(Math.round(sum / d));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}