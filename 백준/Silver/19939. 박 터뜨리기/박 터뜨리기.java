
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
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if(n < (k * (k + 1)) / 2) {
			System.out.println(-1);
			return;
		}else if((n - ((k * (k + 1)) / 2)) % k == 0){
			sb.append(k - 1);
		}else {
			sb.append(k);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
