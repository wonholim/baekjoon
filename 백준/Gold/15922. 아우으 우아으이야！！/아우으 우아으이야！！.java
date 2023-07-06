import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine()) - 1;
		st = new StringTokenizer(br.readLine());
		long sum = 0; 
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		while (t --> 0) {
			st = new StringTokenizer(br.readLine());
			long xx = Integer.parseInt(st.nextToken());
			long yy = Integer.parseInt(st.nextToken());
			if (xx >= x && yy <= y) continue;
			else if (xx <= y) y = Math.max(yy, y);
			else {sum += y - x; x = xx; y = yy;}
		}
		sum += y - x;
		System.out.println(sum);
	}
}
