
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
		String[] k = br.readLine().split(" ");
	    if(Integer.parseInt(k[0]) + Integer.parseInt(k[2]) == Integer.parseInt(k[4])) sb.append("YES");
	    else sb.append("NO");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
