import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 100; i++) {
			if(i * i < a) {
				continue;
			}else if(i * i > b) {
				break;
			}else {
				list.add(i * i);
				sum += i * i;
			}
		}
		if(sum == 0) sb.append(-1);
		else sb.append(sum + "\n" + list.get(0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
