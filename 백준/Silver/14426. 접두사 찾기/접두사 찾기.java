import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String[] e = new String[a];
		int count = 0;
		for(int i = 0; i < a; i++) {
			String c = br.readLine();
			e[i] = c;
		}
		for(int i = 0; i < b; i++) {
			String d = br.readLine();
			for(int j = 0; j < a; j++) {
				if(e[j].startsWith(d)) {count++; break;}
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
