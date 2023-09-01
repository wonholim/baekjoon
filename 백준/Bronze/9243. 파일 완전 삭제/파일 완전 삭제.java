import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (char c : br.readLine().toCharArray()) {
			if (n % 2 == 1) sb.append(c == '0' ? '1' : '0');
			else sb.append(c);
		}
		if (sb.toString().equals(br.readLine())) System.out.println("Deletion succeeded");
		else System.out.print("Deletion failed");
	}
}