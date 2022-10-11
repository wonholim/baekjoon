import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] b = new boolean[20001];
		for(int i = 2; i < b.length; i++) {
			if(b[i]) continue;
			for(int j = 2 * i; j < b.length; j = j + i) {
				b[j] = true;
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 2; i < b.length; i++) {
			if(!b[i]) list.add(i);
		}
		int a = Integer.parseInt(br.readLine());
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i - 1) * list.get(i) < a) continue;
			else if(list.get(i - 1) * list.get(i) > a) {
				sb.append(list.get(i - 1) * list.get(i));
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
