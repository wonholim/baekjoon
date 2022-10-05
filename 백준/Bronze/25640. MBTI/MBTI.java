import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		int b = Integer.parseInt(br.readLine());
		int c = 0;
		while(b --> 0) {
			if(a.equals(br.readLine())) c++;
		}
		sb.append(c);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
