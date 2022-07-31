import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
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
		st = new StringTokenizer(br.readLine());
		int q = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int count = 0;
		Map<String, String> m = new HashMap<>();
		while(b --> 0) {
			st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
			String d = st.nextToken();
			m.put(c, d);
		}
		while(a --> 0) {
			String e = br.readLine();
			String f = m.get(e);
			if(f != null) {
				if(f.equals("W")) count += q;
				else if(f.equals("L")) count -= w;
			}else {
				count -= w;
			}
			if(count >= r) {break;}
			if(count < 0) count = 0;
		}
		if(count >= r) sb.append("I AM NOT IRONMAN!!");
		else sb.append("I AM IRONMAN!!");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}