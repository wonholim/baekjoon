import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		if(a < 10) {
			sb.append(a);
		}else {
			int sum = 9;
			for(int i = 10; i <= a; i++) {
				int g = 0;
				for(char c : String.valueOf(i).toCharArray()) {
					g += c - '0';
				}
				if(i % g == 0) {sum++;}
			}
			sb.append(sum);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
