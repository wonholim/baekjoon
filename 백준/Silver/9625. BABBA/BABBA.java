import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		b = new int[46];
		b[0] = 1;
		b[1] = 1;
		b[2] = 2;
		b[3] = 3;
		for(int i = 4; i <= a; i++) {
			b[i] = b[i - 2] + b[i - 1];
		}
		if(a != 1) {
			sb.append(b[a - 2]).append(" ").append(b[a - 1]).append("\n");
		}else {
			sb.append("0 1").append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}


}
