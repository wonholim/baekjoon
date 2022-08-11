import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int tmp = 1;
		int tmpp = 1;
		int sum = 0;
		for(int i = 3; i <= a; i++) {
			sum = (tmp + tmpp)  % 1000000007;
			tmp = tmpp;
			tmpp = sum;
		}
		sb.append(sum).append(" ").append((a - 2) % 1000000007);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
