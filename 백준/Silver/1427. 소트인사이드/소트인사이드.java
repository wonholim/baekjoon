import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		Arrays.sort(a, Collections.reverseOrder());
		for(int i = 0; i < a.length; i++) sb.append(a[i]);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
