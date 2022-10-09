import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		int rank = Integer.parseInt(st.nextToken());
		if(a >= 1) {
			st = new StringTokenizer(br.readLine());
			int[] b = new int[a];
			int real = 1;
			int count = 1;
			for(int i = 0; i < a; i++) {
				b[i] = Integer.parseInt(st.nextToken());
				if(b[i] > target) {count++; real++;}
				else if(b[i] == target) count++;
				else if(b[i] < target) break;
			}
			
			if(count > rank) sb.append("-1");
			else sb.append(real);
		}else {
			sb.append(1);
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
