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
		String a = br.readLine();
		int check;
		int count = 0;
		if(a.length() == 1) {
			check = Integer.parseInt(a);
		}else {
			while(true) {
				check = 0;
				for(char c : a.toCharArray()) {
					check += c - '0';
				}
				count++;
				if(check < 10) break;
				else a = Integer.toString(check);
			}
		}
		if(check % 3 == 0) sb.append(count + "\nYES");
		else sb.append(count + "\nNO");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
