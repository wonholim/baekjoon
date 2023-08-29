import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if (k <= a) {cnt++;}
			k = a;
		}
		System.out.println(cnt + 1);
	}
}
