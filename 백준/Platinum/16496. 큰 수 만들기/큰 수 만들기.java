
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Big{
		String num;
		public Big(String num) {
			this.num = num;
		}
	}
	static ArrayList<Big> list;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			String line = st.nextToken();
			list.add(new Big(line));
		}
		Collections.sort(list, new Comparator<Big>(){
			@Override
			public int compare(Big o1, Big o2) {
				// TODO Auto-generated method stub
				String left = o1.num + o2.num;
				String right = o2.num + o1.num;
				return right.compareTo(left);
			}
		});
		if(list.get(0).num.charAt(0) == '0') {
			System.out.println(0);
			return;
		}
		for(Big o : list) {
			sb.append(o.num);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}


}
