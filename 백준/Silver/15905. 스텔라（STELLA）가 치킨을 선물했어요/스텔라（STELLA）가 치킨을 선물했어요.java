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
	public static class Stella{
		int solved;
		int pt;
		public Stella(int solved, int pt) {
			this.solved = solved;
			this.pt = pt;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		ArrayList<Stella> list = new ArrayList<>();
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int solved = Integer.parseInt(st.nextToken());
			int pt = Integer.parseInt(st.nextToken());
			list.add(new Stella(solved, pt));
		}
		Collections.sort(list, new Comparator<Stella>() {

			@Override
			public int compare(Stella o1, Stella o2) {
				// TODO Auto-generated method stub
				if(o1.solved != o2.solved) {
					return o2.solved - o1.solved;
				}else {
					return o1.pt - o2.pt;
				}
			}
			
		});
		int count = 0;
		for(int i = 5; i < list.size(); i++) {
			if(list.get(4).solved == list.get(i).solved) {
				count++;
			}
		}
		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}