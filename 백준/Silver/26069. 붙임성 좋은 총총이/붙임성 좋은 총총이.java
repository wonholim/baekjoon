
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		Set<String> s = new HashSet<>();
		boolean check = false;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			String l = st.nextToken();
			String r = st.nextToken();
			if(!check) {
				if(l.equals("ChongChong") || r.equals("ChongChong")) {
					check = true;
					s.add(l);
					s.add(r);
				}
			}else {
				if(s.contains(r) || s.contains(l)) {
					s.add(l);
					s.add(r);
				}
			}
		}
		sb.append(s.size());
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	
	}

}
