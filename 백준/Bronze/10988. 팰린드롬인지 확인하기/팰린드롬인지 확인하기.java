

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("");
		int j = a.length - 1;
		for(int i = 0; i < a.length / 2; i++) {
			if(!a[i].equals(a[j])) {
				System.out.println(0);
				return;
			}
			j--;
		}
		sb.append(1);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
