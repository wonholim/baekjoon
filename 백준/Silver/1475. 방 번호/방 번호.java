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
		String a = br.readLine();
		int[] b = new int[10];
		for(char c : a.toCharArray()) {
			if(c - '0' != 9) {
				b[c - '0']++;
			}else {
				b[6]++;
			}
		}
		b[6] = (int) Math.ceil((double)b[6] / 2);
		int max = 0;
		for(int i = 0; i < 10; i++) {
			if(max < b[i]) max = b[i];
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
