import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a;
		Deque<Character> d = new ArrayDeque<>();
		Deque<Character> e = new ArrayDeque<>();
		while((a = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(a);
			String b = st.nextToken();
			String c = st.nextToken();
			for(char q : b.toCharArray()) {
				d.offerLast(q);
			}
			for(char k : c.toCharArray()) {
				if(d.size() == 0) break;
				char j = d.pollFirst();
				if(k == j) {
					e.offerLast(k);
				}else {
					d.offerFirst(j);
				}
			}
			Character[] k = e.toArray(new Character[0]);
			d.clear();
			e.clear();
			String[] x = new String[k.length];
			for(int i = 0; i < x.length; i++) {
				x[i] = k[i].toString();
			}
			String w = String.join("", x);
			if(b.equals(w)){ sb.append("Yes").append("\n"); }
			else { sb.append("No").append("\n"); }
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
