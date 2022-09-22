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
		int a = Integer.parseInt(br.readLine());
		list.add(a);
		while(true) {
			int sum = 0;
			char[] c = Integer.toString(a).toCharArray();
			for(int i = 0; i < c.length; i++) {
				sum += c[i] - '0';
			}
			a = (c[c.length - 1] - '0')* 10 + sum % 10;
			if(!list.contains(a)) {
				list.add(a);
			}else {
				break;
			}
		}
		sb.append(list.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
