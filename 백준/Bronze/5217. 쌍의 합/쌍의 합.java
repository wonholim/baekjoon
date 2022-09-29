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
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			ArrayList<String> list = new ArrayList<>();
			int b = Integer.parseInt(br.readLine());
			sb.append("Pairs for ").append(b).append(": ");
			for(int i = 1; i < b; i++) {
				for(int j = i + 1; j < b; j++) {
					if(i + j == b) {
						list.add(i + " " + j);
					}
				}
			}
			for(int i = 0; i < list.size(); i++) {
				sb.append(list.get(i));
				if(i != list.size() - 1) {
					sb.append(", ");
				}
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
