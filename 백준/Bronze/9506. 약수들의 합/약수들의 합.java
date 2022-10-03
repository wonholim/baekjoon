import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a;
		while(true) {
			a = Integer.parseInt(br.readLine());
			if(a == -1) break;
			int sum = 0;
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 1; i < a; i++) {
				if(a % i == 0) {
					sum += i;
					list.add(i);
				}
			}
			if(sum == a) {
				sb.append(a + " = ");
				for(int i = 0; i < list.size(); i++) {
					if(i == list.size() - 1) {
						sb.append(list.get(i) + "\n");
					}else {
						sb.append(list.get(i) + " + ");
					}
				}
			}
			else {
				sb.append(a + " is NOT perfect.\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}