import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int cnt = 0;
		while (a != b) {
			cnt++;
			a = ++a % 24;
		}
		System.out.println(cnt);
	}
}