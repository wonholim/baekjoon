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
		b = new int[250001];
		b[0] = 0;
		b[1] = 0;
		for(int i = 2; i <= 250000; i++) {
			b[i] = i;
		}
		for(int i = 2; i < 250000; i++) {
			if(b[i] == 0) continue;
			for(int j = 2 * i; j <= 250000; j = j + i) {
				b[j] = 0;
			}
		}
		while(true) {
			int count = 0;
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			for(int i = 2; i <= 250000; i++) {
				if(b[i] <= a) continue;
				if(b[i] != 0 && b[i] <= 2 * a) count++;
				if(b[i] > 2 * a) break;
			}
			sb.append(count).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
