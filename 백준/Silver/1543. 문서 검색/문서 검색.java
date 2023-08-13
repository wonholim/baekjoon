import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String word = br.readLine();
		int count = 0, index = 0;
		while ((index = line.indexOf(word, index)) != -1) {
			count++;
			index += word.length();
		}
		System.out.println(count);
	}
}