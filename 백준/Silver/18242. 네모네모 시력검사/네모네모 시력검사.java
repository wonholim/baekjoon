import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main { 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String print = null;
		List<Integer> tD = new ArrayList<>();
		List<Integer> mid = new ArrayList<>();
		Pattern p = Pattern.compile("#");
		while (n --> 0) {
			String line = br.readLine();
			String rep = line.replaceAll("\\.", "");
			if (rep.length() == 0) continue;
			if (rep.length() == 1) {
				int idx = line.indexOf('#');
				print = mid.remove(0).equals(idx) ? "RIGHT" : "LEFT";
			} else if (rep.length() == 2) {
				Matcher mat = p.matcher(line);
				while (mat.find()) {mid.add(mat.start());}
			}
			else tD.add(rep.length());
		}
		print = (print == null) ? tD.get(0) > tD.get(1) ? "DOWN" : "UP" : print;
		System.out.println(print);
	}
}
