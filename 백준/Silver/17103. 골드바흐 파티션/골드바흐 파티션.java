import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = 1000000;
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] c = new boolean[a + 1];
		c[0] = true;
		c[1] = true;
		for(int i = 2; i <= a; i++) {
			if(c[i] == true) continue;
			list.add(i);
			for(int j = i + i; j <= a; j = j + i) {
				c[j] = true;
			}
		}
		int g = Integer.parseInt(br.readLine());
		while(g --> 0) {
			int count = 0;
			int b = Integer.parseInt(br.readLine());
			for(int i = 0; i < list.size(); i++) {
				int d = list.get(i);
				if(b - d >= 2 && d <= b - d) {
					if(c[b - d] == false) {
						count++;
					}
				}
			}
			sb.append(count).append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
