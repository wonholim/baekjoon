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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int[] c = new int[a + 1];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2; i <= a; i++) {
			c[i] = i;
		}
		for(int i = 2; i <= a; i++) {
			if(c[i] == 0) continue;
			else list.add(c[i]);
			for(int j = i + i; j <= a; j = j + i) {
				if(c[j] != 0) {
					list.add(c[j]);
					c[j] = 0;
				}else continue;
			}
		}
		sb.append(list.get(b - 1));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
}
