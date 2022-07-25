import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int[] a = new int[4];
		for(int i = 0; i < 3; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		int b = list.get(1) - list.get(0);
		int c = list.get(2) - list.get(1);
		int min = Math.min(b, c);
		a[0] = list.get(0);
		for(int i = 1; i < 4; i++) {
			a[i] = a[i - 1] + min;
		}
		for(int i = 0; i < 4; i++) {
			if(!list.contains(a[i]))
				bw.write(Integer.toString(a[i]));
		}
		bw.flush();
		bw.close();
		br.close();
	}

}