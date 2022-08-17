import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static long[] b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		b = new long[36];
		b[0] = 1;
		b[1] = 1;
		b[2] = 2;
        int a = Integer.parseInt(br.readLine());
		for(int i = 3; i <= a; i++) {
			for(int j = i - 1; 0 <= j; j--) {
				b[i] += b[j] * b[i - j - 1]; 
			}
		}
		sb.append(b[a]);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
