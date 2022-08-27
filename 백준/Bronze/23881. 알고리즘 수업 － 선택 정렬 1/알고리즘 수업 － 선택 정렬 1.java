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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int index = 0;
		int[] c = new int[a];
		int max = 0;
		for(int i = 0; i < a; i++) {
			c[i] = Integer.parseInt(st.nextToken());
		}
		int count = 0;
		for(int i = a - 1; 0 <= i; i--) {
			index = i;
			for(int j = i - 1; 0 <= j; j--) {
				if(c[j] > c[index]) {
					index = j;
				}
			}
			if(c[index] == c[i]) {continue;}
			else {
				count++;
				if(count == b) {sb.append(c[i]).append(" ").append(c[index]); break;}
				int tmp = c[index];
				c[index] = c[i];
				c[i] = tmp;
			}
		}
		if(count != b) sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
