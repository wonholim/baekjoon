import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(br.readLine());
		if(a == 0 || a == 1 || a == 2 || a == 3 || a == 4) {
			sb.append(a);
		}else {
			int max = 1;
			if(a % 3 == 1) {
				for(int i = 0; i < ((a / 3) - 1) % 10007; i++) {
					max *= 3;
					max = max % 10007;
				}
				max = (max * 4) % 10007;
				sb.append(max);
			}else if(a % 3 == 2) {
				for(int i = 0; i < ((a / 3)) % 10007; i++) {
					max *= 3;
					max = max % 10007;
				}
				max = (max * 2) % 10007;
				sb.append(max);
			}else {
				for(int i = 0; i < ((a / 3)) % 10007; i++) {
					max *= 3;
					max = max % 10007;
				}
				sb.append(max);
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
