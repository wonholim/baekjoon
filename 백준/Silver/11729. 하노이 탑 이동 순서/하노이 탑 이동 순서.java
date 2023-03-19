
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		sb.append((int)(Math.pow(2, size) - 1) + "\n");
		hanoi(size, 1, 3);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void hanoi(int size, int i, int j) {
		// TODO Auto-generated method stub
		if(size == 1) {sb.append(i + " " + j + "\n"); return;}
		hanoi(size - 1, i, 6 - i - j);
		sb.append(i + " " + j + "\n");
		hanoi(size - 1, 6 - i - j, j);
	}

}
