

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
		while(t --> 0) {
			char[] k = br.readLine().toUpperCase().toCharArray();
            for (int i = 0; i < k.length; i++) {
                char c = k[i];
                if (c <= 'C') k[i] = '2';
                else if (c <= 'F') k[i] = '3';
                else if (c <= 'I') k[i] = '4';
                else if (c <= 'L') k[i] = '5';
                else if (c <= 'O') k[i] = '6';
                else if (c <= 'S') k[i] = '7';
                else if (c <= 'V') k[i] = '8';
                else k[i] = '9';
            }
            boolean check = true;
            int j = k.length - 1;
            for(int i = 0; i < k.length / 2; i++) {
            	if(k[i] != k[j--]) {
            		check = false;
            		break;
            	}
            }
			sb.append(check ? "YES\n" : "NO\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
