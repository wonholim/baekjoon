import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[4];
		for(int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st.nextToken());
		Integer.parseInt(st.nextToken());
		Integer.parseInt(st.nextToken());
		boolean check = false;
		for(int i = 0; i < a.length; i++) {
			if(b == a[i]) {
				sb.append(i+1);
				check = true;
				break;
			}
		}
		if(!check) sb.append(0);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
