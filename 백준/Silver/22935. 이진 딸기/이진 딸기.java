

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
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(st.nextToken());
		String[] s = {
				"",
				"VVV딸기",
				"VV딸기V",
				"VV딸기딸기",
				"V딸기VV",
				"V딸기V딸기",
				"V딸기딸기V",
				"V딸기딸기딸기",
				"딸기VVV",
				"딸기VV딸기",
				"딸기V딸기V",
				"딸기V딸기딸기",
				"딸기딸기VV",
				"딸기딸기V딸기",
				"딸기딸기딸기V",
				"딸기딸기딸기딸기"
		};
		while (t --> 0) {
			int k = Integer.parseInt(br.readLine()) - 1;
			if((k % 28) + 1 <= 15) sb.append(s[(k % 28) + 1] + "\n");
			else sb.append(s[30 - ((k % 28) + 1)] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
