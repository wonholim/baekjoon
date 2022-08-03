import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		double c = a;
		Map<Integer, Integer> m = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		Set<Integer> s = new HashSet<>();
		double sum = 0;
		int max = -1;
		while(a --> 0) {
			int b = Integer.parseInt(br.readLine());
			list.add(b);
			m.put(b, m.getOrDefault(b, 0) + 1);
			s.add(b);
			sum = sum + b;
		}
		for(int k : s) {
			if(m.get(k) > max) {
				max = m.get(k);
			}
		}
		
		for(int k : s) {
			if(m.get(k) == max) {
				if(!list1.contains(k)) list1.add(k);
			}
		}
		Collections.sort(list);
		Collections.sort(list1);
		sum = Math.round(sum / c);
		sb.append((int)sum).append("\n");
		sb.append(list.get(list.size() / 2)).append("\n");
		if(list1.size() == 1) {
			sb.append(list1.get(0)).append("\n");
		}else {
			sb.append(list1.get(1)).append("\n");
		}
		sb.append(Integer.toString(list.get(list.size() - 1) - list.get(0))).append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
