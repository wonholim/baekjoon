import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(check(i)) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static boolean check(int i) {
		// TODO Auto-generated method stub
		if(i < 10) return true;
		char[] c = Integer.toString(i).toCharArray();
		int tmp = c[1] - c[0] - '0';
		for(int k = 1; k < c.length; k++) {
			if(c[k] - c[k - 1] - '0' != tmp) return false;
		}
		return true;
	}

}
