import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] a = new int[4];
		for(int i = 0; i < 4; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		if(a[0] < a[1] && a[1] < a[2] && a[2] < a[3]) {
			sb.append("Fish Rising");
		}else if(a[0] > a[1] && a[1] > a[2] && a[2] > a[3]) {
			sb.append("Fish Diving");
		}else if(a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) {
			sb.append("Fish At Constant Depth");
		}else {
			sb.append("No Fish");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
