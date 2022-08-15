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
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				list.add(i);
			}
		}
		int b = Integer.parseInt(st.nextToken());
		if(list.size() < b) {
			sb.append(0);
		}else {
			sb.append(list.get(b - 1));
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
