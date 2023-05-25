
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] c = new int[n];
		st = new StringTokenizer(br.readLine());
		int odd = 0;
		for(int i = 0; i < n; i++) {
			c[i] = Integer.parseInt(st.nextToken());
			if(c[i] % 2 != 0) odd++;
		}
		Arrays.sort(c);
		boolean check = false;
		int ans = 0;
		if(odd % 2 != 0) {
			for(int i = 0; i < n; i++) {
				if(c[i] % 2 != 0 && !check) {
					check = true;
					continue;
				}else {
					ans += c[i];
				}
			}
		}else {
			for(int i = 0; i < n; i++) {
					ans += c[i];
			}
		}
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
