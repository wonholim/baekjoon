import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a;
		while(true) {
			a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			ArrayList<String> list = new ArrayList<>();
			while(a --> 0) {
				list.add(br.readLine());
			}
			Collections.sort(list, (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase()));
			sb.append(list.get(0) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
