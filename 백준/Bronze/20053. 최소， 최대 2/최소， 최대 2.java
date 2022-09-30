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
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			int b = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int max = -1000001;
			int min = 1000001;
			for(int i = 0; i < b; i++) {
				int k = Integer.parseInt(st.nextToken());
				if(k > max) max = k;
				if(k < min) min = k;
			}
			sb.append(min + " " + max +"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
