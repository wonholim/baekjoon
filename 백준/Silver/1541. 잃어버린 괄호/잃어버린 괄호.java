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
		StringBuilder sb = new StringBuilder();
		String[] a = br.readLine().split("-");
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < a.length; i++) {
			int sum = 0;
			String[] b = a[i].split("\\+");
			for(int k = 0; k < b.length; k++) {
				sum += Integer.parseInt(b[k]);
			}
			list.add(sum);
		}
		int low = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			low -= list.get(i);
		}
		sb.append(low);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
