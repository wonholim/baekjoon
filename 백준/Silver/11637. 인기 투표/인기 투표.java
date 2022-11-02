
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
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
			int b = Integer.parseInt(br.readLine());
			int[] c = new int[b + 1];
			int sum = 0;
			for(int i = 1; i <= b; i++) {
				c[i] = Integer.parseInt(br.readLine());
				sum += c[i];
			}
			int max = 0;
			int index = 0;
			int count = 0;
			for(int i = 1; i <= b; i++) {
				if(max < c[i]) {
					max = c[i];
					index = i;
				}
			}
			for(int i = 1; i <= b; i++) {
				if(max == c[i]) {
					count++;
				}
			}
			if(count > 1) {sb.append("no winner\n"); continue;}
			
			if(max > sum / 2) {
				sb.append("majority winner " + index + "\n");
			}else {
				sb.append("minority winner " + index + "\n");
			}
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
