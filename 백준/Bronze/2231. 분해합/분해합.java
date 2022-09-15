import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		boolean check = false;
		int i;
		for(i = 1; i <= a; i++) {
			int sum = 0;
			for(char c : Integer.toString(i).toCharArray()) {
				sum += c - '0';
			}
			if(i + sum == a) {
				sb.append(i);
				check = true;
				break;
			}
		}
		if(!check) sb.append(0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
