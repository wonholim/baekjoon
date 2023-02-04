

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String k = br.readLine();
		boolean check = false;
		boolean others = false;
		if(k.charAt(0) >= 'A' && k.charAt(0) <= 'Z') others = true;
		else if(k.charAt(0) == '_') others = true;
		else if(k.charAt(k.length() - 1) == '_') others = true;
		int count = 0;
		for(char c : k.toCharArray()) {
			if(count >= 2) others = true;
			else if(c == '_') count++;
			else count = 0;
		}
		int under = 0;
		int upper = 0;
		for(char c : k.toCharArray()) {
			if(c == '_') under++;
			else if('A' <= c && c <= 'Z') upper++;
		}
		if(under > 0 && upper > 0) others = true;
		for(char c : k.toCharArray()) {
			if(c == '_') {
				check = true;
			}
		}
		if(others) {
			System.out.println("Error!");
			return;
		}
		if(check) {
			String[] cpp = k.split("_");
			sb.append(cpp[0]);
			for(int i = 1; i < cpp.length; i++) {
				sb.append((char)(cpp[i].charAt(0) - 32));
				for(int j = 1; j < cpp[i].length(); j++) {
					sb.append(cpp[i].charAt(j));
				}
			}
		}else {
			for(char c : k.toCharArray()) {
				if('A' <= c && c <= 'Z') {
					sb.append("_");
					sb.append((char)(c + 32));
				}else {
					sb.append(c);
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
