import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		String[] b = new String[a];
		for(int i = 0; i < a; i++) {
			b[i] = br.readLine();
		}
		Arrays.sort(b, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length() != o2.length()) {
					return o1.length() - o2.length();
				}else if(o1.length() == o2.length()) {
					int s1 = 0;
					int s2 = 0;
					for(char c : o1.toCharArray()) {
						if(c > '0' && c <= '9') {
							s1 += c - '0';
						}
					}
					for(char c : o2.toCharArray()) {
						if(c > '0' && c <= '9') {
							s2 += c - '0';
						}
					}
					if(s1 != s2) {
						return s1 - s2;
					}else {
						return o1.compareTo(o2);
					}
				}
				return o1.compareTo(o2);
			}
		});
		for(int i = 0; i < a; i++) {
			sb.append(b[i] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
