

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    // 2:00에서 깍여서 내려가는게 아닌
    // 0:00에서 시작하므로..
    // 조리시작 버튼을 누르면서 시작이가능함
    // 이걸 놓쳤네
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String[] g = br.readLine().split(":");
		int a = Integer.parseInt(g[0]) * 60 + Integer.parseInt(g[1]);
		int count = 1;
		if (a >= 600) {
			count += a / 600;
			a %= 600;
		}
		if (a >= 60) {
			count += a / 60;
			a %= 60;
		}
		if (a >= 30) {
			count += (a - 30) / 10;
			a %= 10;
		}
		if (a >= 10) {
			count += a / 10;
			a %= 10;
		}

		sb.append(count);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
