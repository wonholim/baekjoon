import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int cla = 1;
		while(a --> 0) {
			st = new StringTokenizer(br.readLine());
			int max = 0;
			int sum = 0;
			sb.append("Class ").append(cla).append("\n");
			int i = 0;
			int b = Integer.parseInt(st.nextToken());
			int[] c = new int[b];
			while(b --> 0) {
				int d = Integer.parseInt(st.nextToken());
				sum = sum + d;
				c[i] = d;
				i++;
			}
			Arrays.sort(c);
			sb.append("Max ").append(c[c.length - 1]).append(", ");
			sb.append("Min ").append(c[0]).append(", ");
			sb.append("Largest gap ");
			for(int j = 1; j < c.length; j++) {
				if((c[j] - c[j - 1]) > max) {
					max = (c[j] - c[j - 1]);
				}
			}
			sb.append(max).append("\n");
			cla++;
		}
		
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}