
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static int n = 3;
	static char[][] c;
	static int o;
	static int x;
	static int oo;
	static int xx;
	static boolean rp;
	static boolean cu;
	static boolean cr;
	static boolean ch;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		while (true) {
			String line = br.readLine();
			if(line.equals("end")) break;
			c = new char[n][n];
			ch = false;
			o = 0;
			x = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = line.charAt((n * i) + j);
					if(c[i][j] == 'O') o++;
					else if(c[i][j] == 'X') x++;
				}
			}
			if(o > x || Math.abs(o - x) > 1) {sb.append("invalid\n"); continue;}
			rp = row();
			if(ch) {sb.append("invalid\n"); continue;}
			cu = cul();
			if(ch) {sb.append("invalid\n"); continue;}
			cr = cross();
			if(ch) {sb.append("invalid\n"); continue;}
			if(rp || cr || cu) {sb.append("valid\n"); continue;}
			if(o + x != 9) {sb.append("invalid\n"); continue;}
			sb.append("valid\n");
		}
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}
	private static boolean cross() {
		// TODO Auto-generated method stub
		int count = 0;
		if(c[0][0] != '.' && c[0][0] == c[1][1] && c[1][1] == c[2][2]) {
			if(c[0][0] == 'O') {
				if(x > o) ch = true;
			}else {
				if(x == o) ch = true;
			}
			count++;
		}
		if(c[0][2] != '.' && c[0][2] == c[1][1] && c[1][1] == c[2][0]) {
			if(c[0][2] == 'O') {
				if(x > o) ch = true;
			}else {
				if(x == o) ch = true;
			}
			count++;
		}
		if(count >= 1) return true;
		return false;
	}
	private static boolean cul() {
		// TODO Auto-generated method stub
		oo = 0;
		xx = 0;
		int count = 0;
		for (int k = 0; k < n; k++) {
			boolean check = false;
			if(c[0][k] == '.') continue;
			for (int i = 1; i < n; i++) {
				if(c[0][k] != c[i][k]) {
					check = true;
					break;
				}
			}
			if(!check) {
				if(c[0][k] == 'O') {
					if(x > o) ch = true;
				}else {
					if(x == o) ch = true;
				}
				count++;
			}
		}
		if(count == 1) return true;
		else if(count > 1) ch = true;
		return false;
	}
	private static boolean row() {
		// TODO Auto-generated method stub
		oo = 0;
		xx = 0;
		int count = 0;
		for (int k = 0; k < n; k++) {
			boolean check = false;
			if(c[k][0] == '.') continue;
			for (int i = 1; i < n; i++) {
				if(c[k][0] != c[k][i]) {
					check = true;
					break;
				}
			}
			if(!check) {
				if(c[k][0] == 'O') {
					if(x > o) ch = true;
				}else {
					if(x == o) ch = true;
				}
				count++;
			}
		}
		if(count == 1) return true;
		else if(count > 1) ch = true;
		return false;
	}

}
