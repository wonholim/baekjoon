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
		long a = Long.parseLong(br.readLine()) % 7;
		if(a != 0 && a != 2) {
			sb.append("SK");
		}else {
			sb.append("CY");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
