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
		int[] a = new int[5];
		for(int i = 0 ; i < 5; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int check = 0;
		int n = 1;
		while(true) {
			for(int i = 0 ; i < 5; i++) {
				if(n % a[i] == 0) check++;
			}
			if(check >= 3) break;
			else {check = 0; n++;}
		}
		sb.append(n);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
