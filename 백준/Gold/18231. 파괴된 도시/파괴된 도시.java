import java.io.*;
import java.util.*;
public class Main {
		public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		List<Integer>[] list = new ArrayList[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new ArrayList<>();
		}
		while (m --> 0) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			list[u].add(v);
			list[v].add(u);
		}
		Set<Integer> d = new TreeSet<>();
		int k = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (k --> 0) {
			d.add(Integer.parseInt(st.nextToken()));
		}
        List<Integer> ans = new ArrayList<>();
        Set<Integer> f = new TreeSet<>();
        List<Integer> tmp = new ArrayList<>();
        for (int dc : d) {
        	tmp.clear();
        	tmp.add(dc);
        	boolean check = false;
        	for (int c : list[dc]) {
        		if (!d.contains(c)) {
        			check = true;
        			break;
        		} else {
        			tmp.add(c);
        		}
        	}
        	if (!check) {
        		ans.add(dc);
        		f.addAll(tmp);
        	}
            if (f.size() == d.size()) {
            	System.out.println(ans.size());
            	for (int q : ans) System.out.print(q + " ");
            	return;
            }
        }
        System.out.println(-1);
	}
}