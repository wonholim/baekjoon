
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) list.add(Integer.parseInt(st.nextToken()));
		Collections.sort(list);
		int h = n / 2 + (n % 2);
		int l = h - 1;
		while(l >= 0 || h < n) {
			if(l >= 0) {ans.add(list.get(l--));}
			if(h < n) {ans.add(list.get(h++));}
		}
		for(int k : ans) sb.append(k + " ");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
