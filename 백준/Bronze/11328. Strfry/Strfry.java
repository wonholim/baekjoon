import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(a --> 0) {
			st= new StringTokenizer(br.readLine());
			String[] b = st.nextToken().split("");
			Arrays.sort(b);
			String[] c = st.nextToken().split("");
			Arrays.sort(c);
			if(b.length == c.length) {
				boolean check = false;
				for(int i = 0; i < b.length; i++) {
					if(!b[i].equals(c[i])) {
						check = true;
						break;
					}
				}
				if(check) sb.append("Impossible\n");
				else sb.append("Possible\n");
			}else {
				sb.append("Impossible\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}