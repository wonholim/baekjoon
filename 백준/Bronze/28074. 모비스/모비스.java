import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] d = new boolean[26];
		for (char c : br.readLine().toCharArray()) {
			d[c - 'A'] = true;
		}
		if (d['M' - 'A'] && d['O' - 'A'] && d['B' - 'A'] && d['I' - 'A'] && d['S' - 'A']) System.out.println("YES");
		else System.out.println("NO");
	}
}