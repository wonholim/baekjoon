
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb;
	static String[] c;
	static int level;
	static List<String>[] list;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		level = Integer.parseInt(br.readLine());
		list = new ArrayList[level + 1];
		for(int i = 0; i < level; i++) {
			list[i] = new ArrayList<>();
		}
		c = br.readLine().split(" ");
		tree(0, c.length, 0);
		for(int i = 0; i < level; i++) {
			for(String l : list[i]) {
				sb.append(l + " ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void tree(int i, int j, int depth) {
		// TODO Auto-generated method stub
		if(depth == level) return;
		if(i <= j) {
			int g = (i + j) / 2;
			list[depth].add(c[g]);
			tree(i, g, depth + 1);
			tree(g, j, depth + 1);
		}
	}

}
