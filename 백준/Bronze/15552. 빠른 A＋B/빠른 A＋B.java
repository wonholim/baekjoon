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
		int a = Integer.parseInt(br.readLine());
		StringTokenizer s;
		for(int i = 0; i < a; i++) {
			s = new StringTokenizer(br.readLine()," ");
			int b = Integer.parseInt(s.nextToken()) + Integer.parseInt(s.nextToken());
			bw.write(b + "\n");
		}
		br.close();
		bw.close();
	}
}
