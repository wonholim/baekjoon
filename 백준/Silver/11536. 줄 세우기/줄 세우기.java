import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		List<String> o = new ArrayList<>();
		List<String> s = new ArrayList<>();
		while (n --> 0) {
			String l = br.readLine();
			o.add(l);
			s.add(l);
		}
		Collections.sort(s);
		String inc = s.toString();
		Collections.sort(s, Collections.reverseOrder());
		String dec = s.toString();
		String ans = "NEITHER";
		if (o.toString().equals(inc)) {
			ans = "INCREASING";
		} else if (o.toString().equals(dec)) {
			ans = "DECREASING";
		}
		System.out.println(ans);
	}
}