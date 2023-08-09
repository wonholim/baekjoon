import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int ch = 0;
		for (char c : br.readLine().toCharArray()) {
			if (c == 'C') ch++;
		}
		System.out.println((int)Math.ceil((double)(ch) / (n - ch + 1)));
	}
}
