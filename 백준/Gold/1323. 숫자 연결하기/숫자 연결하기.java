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
		String start = st.nextToken();
		Set<Long> set = new HashSet<>();
		long a = Long.parseLong(start);
		long b =  Long.parseLong(st.nextToken());
		int count = 1;
		while(true) {
			if(a % b == 0) {
				bw.write(Integer.toString(count));
				break;
			}else {
				if(!set.add(a % b)) {
					bw.write(Integer.toString(-1));
					break;
				}
				int e = (int)(a % b);
				count++;
				String d = String.valueOf(e) + start;
				a = Long.parseLong(d);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
