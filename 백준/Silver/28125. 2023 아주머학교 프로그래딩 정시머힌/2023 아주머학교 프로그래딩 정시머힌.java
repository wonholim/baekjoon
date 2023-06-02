
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<String, String> map = Map.of("@", "a", "[", "c", "!", "i", ";", "j", "^", "n", "0", "o", "7", "t", "\\\\'", "w", "\\'", "v");
		LinkedHashSet<String> s = new LinkedHashSet<>();
		s.add("@"); s.add("["); s.add("!"); s.add(";"); s.add("^"); s.add("0"); s.add("7"); s.add("\\\\'"); s.add("\\'");
		int t = Integer.parseInt(st.nextToken());
		while(t --> 0) {
			String line = br.readLine();
			int count = 0;
			for(String l : s) {
				if(line.contains(l)) {
					int index = 0;
					while ((index = line.indexOf(l, index)) != -1) {
						count++;
						index += l.length();
					}
					line = line.replace(l, map.get(l));
				}
			}
			if(count >= (double)line.length() / 2) {
				sb.append("I don't understand").append("\n");
			}else {
				sb.append(line).append("\n");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
