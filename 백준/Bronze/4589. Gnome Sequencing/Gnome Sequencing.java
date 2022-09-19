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
		int a = Integer.parseInt(br.readLine());
		sb.append("Gnomes:\n");
		while(a --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] b = new int[3];
			boolean o = false;
			boolean n = false;
			for(int i = 0; i < 3; i++) {
				b[i] = Integer.parseInt(st.nextToken());
			}
			if(b[0] <= b[1] && b[1] <= b[2]) o = true;
			if(b[0] >= b[1] && b[1] >= b[2]) n = true;
			if(!o && !n) sb.append("Unordered\n");
			else sb.append("Ordered\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
