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
		int b = Integer.parseInt(st.nextToken());
		boolean[] c = new boolean[100000001];
		for(int i = 2; i <= b; i++) {
			if(c[i]) continue;
			for(int j = i * 2; j <= b; j = j + i) {
				c[j] = true;
			}
		}
		for(int i = a; i <= b; i++) {
			if(c[i]) continue;
			if(i < 10) {
				sb.append(i + "\n");
			}else if(!c[i]){
				char[] d = Integer.toString(i).toCharArray();
				int j = 0;
				int k = 0;
				boolean check = true;
				for(k = d.length - 1; d.length / 2 <= k; k--) {
					if(d[j] != d[k]) {check = false; break;}
					j++;
				}
				if(check) sb.append(i + "\n");
			}
		}
		sb.append(-1);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}