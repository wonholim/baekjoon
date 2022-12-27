

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		while(a --> 0) {
			System.gc();
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			Map<Long, Integer> m = new HashMap<>();
			int max = 0;
			long index = 0;
			for(int i = 0; i < b; i++) {
				long k = Long.parseLong(st.nextToken());
				m.put(k, m.getOrDefault(k, 0) + 1);
				if(m.get(k) > max) {
					max = m.get(k);
					index = k;
				}
			}
			if(max > (double)b / 2) {sb.append(index+"\n");}
			else {sb.append("SYJKGW\n");}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
