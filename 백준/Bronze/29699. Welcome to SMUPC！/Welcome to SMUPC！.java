import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "WelcomeToSMUPC";
		System.out.print(s.charAt((Integer.parseInt(br.readLine()) - 1) % s.length()));
	}
}