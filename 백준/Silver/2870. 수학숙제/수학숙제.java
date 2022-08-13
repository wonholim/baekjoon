import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		ArrayList<BigInteger> list = new ArrayList<>();
		int a = Integer.parseInt(br.readLine());
		while(a --> 0) {
			String[] b = br.readLine().replaceAll("[^0-9]", " ").split(" ");
			for(int i = 0; i < b.length; i++) {
				if(!b[i].equals("")) {
				BigInteger k = new BigInteger(b[i]);
				list.add(k);
				}else {
					continue;
				}
			}
		}
		Collections.sort(list);
		for(BigInteger i : list) {
			sb.append(i).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}