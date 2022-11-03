

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayList<int[]> list = new ArrayList<>();
		list.add(new int[] {2,3,5,7});
		list.add(new int[] {23,29,31,37,53,59,71,73,79});
		list.add(new int[] {233,239,293,311,313,317,373,379,593,599,719,733,739,797});
		list.add(new int[] {2333,2339,2393,2399,2939,3119,3137,3733,3739,3793,3797,5939,7193,7331,7333,7393});
		list.add(new int[] {23333,23339,23399,23993,29399,31193,31379,37337,37339,37397,59393,59399,71933,73331,73939});
		list.add(new int[] {233993,239933,293999,373379,373393,593933,593993,719333,739391,739393,739397,739399});
		list.add(new int[] {2339933,2399333,2939999,3733799,5939333,7393913,7393931,7393933});
		list.add(new int[] {23399339,29399999,37337999,59393339,73939133});
		int a = Integer.parseInt(st.nextToken());
		for(int k : list.get(a - 1)) {
			sb.append(k + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
