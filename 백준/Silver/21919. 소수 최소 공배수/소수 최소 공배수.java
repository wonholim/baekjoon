import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int[] b = new int[1000000];
		for(int i = 2; i < b.length; i++) {
			if(b[i] == 1) continue;
			for(int j = i * 2; j < b.length; j = j + i) {
				b[j] = 1;
			}
		}
		int a = Integer.parseInt(br.readLine());		
		st = new StringTokenizer(br.readLine());
		Set<Integer> list = new HashSet<>();
		while(a --> 0) {
			int g = Integer.parseInt(st.nextToken());
			if(b[g] == 0) {
				list.add(g);
			}
		}
		if(list.size() == 0) sb.append(-1);
		else {
			long sum = 1;
			for(int k : list) {
				sum *= k;
			}
			sb.append(sum);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
