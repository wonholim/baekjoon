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
		String a;
		while((a = br.readLine()) != null) {
			int somun = 0;
			int daemun = 0;
			int num = 0;
			int space = 0;
			for(char d : a.toCharArray()) {
				if(d == 32) {
					space++;
				}else if(d <= 122 && d >= 97) {
					somun++;
				}else if(d <= 90 && d >= 65) {
					daemun++;
				}else if(d <= 57 && d >= 48) {
					num++;
				}
			}
			sb.append(somun).append(" ").append(daemun).append(" ").append(num).append(" ").append(space).append("\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
