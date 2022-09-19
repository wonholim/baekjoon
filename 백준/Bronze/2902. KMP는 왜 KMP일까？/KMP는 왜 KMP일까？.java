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
		String[] a = br.readLine().split("-");
		for(int i = 0 ; i < a.length; i++) {
			sb.append(a[i].charAt(0));
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
