
import java.io.*;
import java.util.*;

public class Main {
	static Map<Character, Integer> map;
	static Map<Integer, Character> map1;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		map = new HashMap<>();
		map1 = new HashMap<>();
		map.put('A', 0);
		map.put('C', 1);
		map.put('G', 2);
		map.put('T', 3);
		map1.put(0, 'A');
		map1.put(1, 'C');
		map1.put(2,'G');
		map1.put(3, 'T');
		char[][] c = new char[n][m];
		for(int i = 0; i < n; i++) {
			c[i] = br.readLine().toCharArray();
		}
		String dna = "";
		int[][] sos = new int[4][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				sos[map.get(c[i][j])][j]++;
			}
		}
		for(int i = 0; i < m; i++) {
			int index = 0;
			int max = sos[0][i];
			for(int j = 1; j < 4; j++) {
				if(max < sos[j][i]) {
					max = sos[j][i];
					index = j;
				}
			}
			dna += map1.get(index);
		}
		int count = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(dna.charAt(i) != c[j][i]) count++;
			}
		}
		sb.append(dna + "\n" + count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
