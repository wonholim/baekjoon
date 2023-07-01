
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static boolean[][] d = new boolean[6][6];
	static int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
	static int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] c = br.readLine().toCharArray();
		int tx;
		int ty;
		int x = c[0] - 'A';
		int y = c[1] - '1';
		tx = x;
		ty = y;
		d[x][y] = true;
		for(int i = 0; i < 35; i++) {
			c = br.readLine().toCharArray();
			boolean ch = false;
			int xx = c[0] - 'A';
			int yy = c[1] - '1';
			d[xx][yy] = true;
			for(int k = 0; k < 8; k++) {
				if(x + dx[k] == xx && y + dy[k] == yy) {
					ch = true;
					x = xx;
					y = yy;
					break;
				}
			}
			if(!ch) {
				System.out.println("Invalid");
				return;
			}
		}
		boolean ch = false;
		for(int k = 0; k < 8; k++) {
			if(x + dx[k] == tx && y + dy[k] == ty) {
				ch = true;
				break;
			}
		}
		if(!ch) {
			System.out.println("Invalid");
			return;
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(!d[i][j]) {
					System.out.println("Invalid");
					return;
				}
			}
		}
		System.out.println("Valid");
	}

}
