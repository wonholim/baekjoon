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
		int c = 0, d = 0;
		c = (int) (-a + Math.sqrt(Math.pow(a, 2) - b));
		d = (int) (-a - Math.sqrt(Math.pow(a, 2) - b));
		if(d > c) {
			sb.append(c + " "+ d);
		}else if(d == c){
			sb.append(d);
		}else {
			sb.append(d + " " + c);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
