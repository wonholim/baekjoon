
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static char[][] c;
	static Set<Character> s = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = new char[n][n];
		for(int i = 0; i < n; i++) c[i] = br.readLine().toCharArray();
		QuadTree(0, 0, n);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void QuadTree(int i, int j, int n2) {
		// TODO Auto-generated method stub
		checking(i, j, n2);
		if(check()) return;
		else s.clear();
		int k = n2 / 2;
		sb.append("(");
		QuadTree(i, j, k);
		QuadTree(i, j + k, k);
		QuadTree(i + k, j, k);
		QuadTree(i + k, j + k, k);
		sb.append(")");
		
	}
	private static boolean check() {
		// TODO Auto-generated method stub
		if(s.size() == 1) {
			for(char c : s) sb.append(c);
			s.clear();
			return true;
		}
		return false;
	}
	private static void checking(int i, int j, int n2) {
		// TODO Auto-generated method stub
		for(int x = i; x < i + n2; x++) {
			for(int y = j; y < j + n2; y++) {
				s.add(c[x][y]);
			}
		}
		
	}

}
