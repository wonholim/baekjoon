import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger count = BigInteger.TWO;
		sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		sb.append(count.pow(a).subtract(BigInteger.ONE)).append("\n");
		if(a <= 20) {
			hanoi(a, 1, 3);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void hanoi(int a, int i, int j) {
		// TODO Auto-generated method stub
		if(a == 1) {
			sb.append(i + " " + j + "\n");
			return;
		}
		hanoi(a - 1, i, 6 - i - j);
		sb.append(i + " " + j + "\n");
		hanoi(a - 1, 6 - i - j, j);
		 
	}

}
