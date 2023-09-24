import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;
		while (n --> 0) ans += Integer.parseInt(st.nextToken()); 
		System.out.println(
				ans == 0 ? "Stay" : ans > 0 ? "Right" : "Left"
				);
	}
}