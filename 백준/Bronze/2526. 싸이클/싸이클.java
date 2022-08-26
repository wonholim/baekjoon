import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] c = new int[1001];
		int a = Integer.parseInt(st.nextToken());
		int tmp = a;
		int b = Integer.parseInt(st.nextToken());
		for(int i = 0; i < 1000; i++) {
			a = (a * tmp) % b;
			c[a]++;
		}
		int count = 0;
		for(int j : c) {
			if(j >= 2) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
