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
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 5; i <= a; i = i * 5) {
			sum += a / i;
		}
		sb.append(sum);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
