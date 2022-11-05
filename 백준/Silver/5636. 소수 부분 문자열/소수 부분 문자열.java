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
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] a = new boolean[100_001];
		for(int i = 2; i <= 100_000; i++) {
			if(a[i]) continue;
			else list.add(i);
			for(int j = 2 * i; j <= 100_000; j = i + j) {
				a[j] = true;
			}
		}
		while(true) {
			String b = br.readLine();
			if(b.equals("0")) break;
			for(int i = list.size() - 1; 0 <= i; i--) {
				if(b.contains(Integer.toString(list.get(i)))) {
					sb.append(list.get(i) + "\n");
					break;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
