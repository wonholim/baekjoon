
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			ArrayList<String> list = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			while(n --> 0) {
				list.add(br.readLine());
			}
			Collections.sort(list);
			boolean check = false;
			for(int i = 1; i < list.size(); i++) {
				if(list.get(i).startsWith(list.get(i - 1))) {
					check = true;
					break;
				}
			}
			sb.append(check ? "NO" : "YES").append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
