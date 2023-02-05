
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static int[] c;
	static boolean[] d;
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        c = new int[10];
        d = new boolean[10];
        for(int i = 0; i < 10; i++) {
        	c[i] = (int)Math.pow(2, i);
        }
        recursive(0, s);
		if(((s - 1023) & m) == s - 1023) sb.append("Thanks");
		else sb.append("Impossible");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
	private static void recursive(int tmp, int s) {
		// TODO Auto-generated method stub
		if(tmp == s) {
			System.out.println("No thanks");
			System.exit(0);
		}else if(tmp > s) {
			return;
		}else {
			for(int i = 0; i < 10; i++) {
				if(!d[i]) {
					d[i] = true;
					recursive(tmp + c[i], s);
					d[i] = false;
				}
			}
		}
	}

}