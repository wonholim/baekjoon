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
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		st = new StringTokenizer(br.readLine());
		int Y = 0;
		int M = 0;
		for(int i = 0; i < a; i++) {
			b[i] = Integer.parseInt(st.nextToken());
			Y += ((b[i] / 30) + 1) * 10;
			M += ((b[i] / 60) + 1) * 15;
		}
		if(Y < M) sb.append("Y " + Y);
		else if(Y > M) sb.append("M " + M);
		else sb.append("Y M " + Y);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
