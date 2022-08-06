import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int b = Integer.parseInt(st.nextToken());
		int a = 8886111;
		int[] c = new int[a + 1];
		for(int i = 2; i <= a; i++) {
			c[i] = i;
		}
		for(int i = 2; i <= a; i++) {
			if(c[i] == 0) continue;
			for(int j = i + i; j <= a; j = j + i) {
				c[j] = 0;
			}
		}
		for(int d : c) {
			if(d != 0) {
				list.add(d);
			}
		}
		sb.append(list.get(b - 1)).append("\n");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
