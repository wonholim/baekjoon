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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int[][] b = new int[a][2];
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			b[i][0] = c;
			b[i][1] = d;
		}
		Arrays.sort(b, (o1, o2) ->{
			if(o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			}else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		for(int i = 0; i < b.length; i++) {
			int[] e = b[i];
			for(int g : e) {
				sb.append(g).append(" ");
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}