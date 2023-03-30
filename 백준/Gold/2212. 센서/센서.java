
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Set<Integer> s = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			s.add(Integer.parseInt(st.nextToken()));
		}
		int[] c = new int[s.size()];
		int i = 0;
		for(int p : s) { c[i++] = p; }
		Arrays.sort(c);
		for(i = 1; i < s.size(); i++) {
			list.add(c[i] - c[i - 1]);
		}
		Collections.sort(list);
		if(k >= c.length) sb.append(0);
		else {
			long sum = 0;
			for(i = 0; i < list.size() - (k - 1); i++) {sum += list.get(i);}
			sb.append(sum);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
