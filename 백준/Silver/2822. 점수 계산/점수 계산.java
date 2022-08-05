import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String b;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list_s = new ArrayList<>();
		int sum = 0;
		while((b = br.readLine()) != null) {
			int a = Integer.parseInt(b);
			list.add(a);
			list_s.add(a);
		}
		Collections.sort(list_s, Collections.reverseOrder());
		int[] c = new int[5];
		for(int i = 0; i < 5; i++) {
			int count = 0;
			for(int k : list) {
				if(list_s.get(i) == k) {
					c[i] = count + 1;
					sum = sum + k;
					break;
				}else {
					count++;
				}
			}
		}
		Arrays.sort(c);
		sb.append(sum).append("\n");
		for(int s : c) {
			sb.append(s).append(" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
