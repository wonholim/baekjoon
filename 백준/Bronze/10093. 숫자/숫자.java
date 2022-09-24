import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		if(b > a) {
			sb.append(b - a - 1 + "\n");
		}else if(a > b){
			long tmp = a;
			a = b;
			b = tmp;
			sb.append(b - a - 1 + "\n");
		}else {	
			sb.append(0 + "\n");
		}
		for(long i = a + 1; i < b; i++) {
			sb.append(i + " ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
