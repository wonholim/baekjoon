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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Set<Integer> s = new HashSet<>();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int[] e = new int[a];
		for(int i = 0 ; i < e.length; i++) {
			e[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		for(int i = 0; i < e.length; i++) {
			int g = c;
			int j = i;
			while(g --> 0) {
				if(j >= e.length) j = 0;
				s.add(e[j]);
				j++;
			}
			s.add(d);
			if(max < s.size()) max = s.size();
			s.clear();
		}
		sb.append(max);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}