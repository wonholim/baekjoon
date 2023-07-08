import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		long sum = 0;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) sum += Math.abs(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) sum += Math.abs(Integer.parseInt(st.nextToken()));
		System.out.println(sum);
	}

}
