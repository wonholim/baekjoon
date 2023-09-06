import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		int k = Integer.parseInt(br.readLine());
		for (; i * i <= k; i++) {}
		System.out.println("The largest square has side length " + (i - 1) + ".");
	}
}