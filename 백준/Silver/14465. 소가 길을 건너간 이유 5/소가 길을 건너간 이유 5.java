
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		boolean[] d = new boolean[a + 1];
		while(c --> 0) {
			int k = Integer.parseInt(br.readLine());
			d[k] = true;
		}
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= b; i++) {
			if(d[i]) count++;
		}
		list.add(count);
		int k = b;
		for(int i = 2; i <= a; i++) {
			if(k + 1 > a) break;
			if(d[i - 1]) count--;
			if(d[k + 1]) count++;
			k++;
			list.add(count);
		}
		Collections.sort(list);
		sb.append(list.get(0));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
