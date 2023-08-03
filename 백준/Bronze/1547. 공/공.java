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
		int n = Integer.parseInt(br.readLine());
		int[] cup = new int[3];
		for (int i = 0; i < 3; i++) cup[i] = i + 1;
		while (n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 3; i++) {
				if (x == cup[i]) {
					x = i;
					break;
				}
			}
			for (int i = 0; i < 3; i++) {
				if (y == cup[i]) {
					y = i;
					break;
				}
			}
			cup[x] ^= cup[y];
			cup[y] ^= cup[x];
			cup[x] ^= cup[y];
		}
		System.out.println(cup[0]);
	}
}
