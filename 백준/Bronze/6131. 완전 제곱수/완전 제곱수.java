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
		int a = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 1; i <= 1000; i++) {
			for(int j = 1; j <= 1000; j++) {
				if(Math.pow(j, 2) - Math.pow(i, 2) == a) {
					count++;
				}else if(Math.pow(j, 2) - Math.pow(i, 2) > a) {
					break;
				}else if(Math.pow(j, 2) - Math.pow(i, 2) < a) {
					continue;
				}
			}
		}
		sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
