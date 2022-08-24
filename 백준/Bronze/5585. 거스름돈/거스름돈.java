import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = 1000 - Integer.parseInt(br.readLine());
		int[] b = new int[6];
		b[0] = 500; b[1] = 100; b[2] = 50; b[3] = 10; b[4] = 5; b[5] = 1;
		int count = 0;
		for(int i = 0; i < 6; i++) {
			if(a >= b[i]) {
				count = count + a / b[i];
				a = a % b[i];
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
