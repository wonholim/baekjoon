import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		Map<Integer, Integer> m = new HashMap<>();
		StringTokenizer st;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			if(!list.contains(b)) list.add(b);
			int c = Integer.parseInt(st.nextToken());
			m.put(b, m.getOrDefault(b, 0) + c);
		}
		Collections.sort(list);
		int sum = list.get(0) + m.get(list.get(0));
		for(int i = 1; i < list.size(); i++) {
			if(sum < list.get(i)) {
				sum = sum + ((list.get(i) - sum ) + m.get(list.get(i)));
			}else {
				sum += m.get(list.get(i));
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}