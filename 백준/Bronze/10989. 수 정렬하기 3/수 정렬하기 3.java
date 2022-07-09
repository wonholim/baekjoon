import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		StringBuilder s = new StringBuilder();
		int[] vc = new int[a];
		for(int i = 0; i < a; i++) {
			vc[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(vc);
		for(int i = 0; i < vc.length; i++) {
			s.append(vc[i] + "\n");
		}
		System.out.println(s.toString());
	}

}
