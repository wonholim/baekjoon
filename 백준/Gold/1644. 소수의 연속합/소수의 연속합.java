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
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
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
		for(int i = 0; i < list.size(); i++) {
			int sum = list.get(i);
			if(sum == a) count++;
			for(int j = i + 1; j < list.size() - 1; j++) {
				sum = sum + list.get(j);
				if(sum > a) {
					break;
				}else if(sum == a) {
					count++;
					break;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}