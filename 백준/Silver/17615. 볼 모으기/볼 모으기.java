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
		int a = Integer.parseInt(br.readLine());
		String b = br.readLine();
		int red = 0;
		int blue = 0;
		int min = 599999;
		for(char c : b.toCharArray()) {
			if(c == 'R') red++;
			else blue++;
		}
		int count = 0;
		for(int i = 0; i < a; i++) {
			if(b.charAt(i) == 'R') count++;
			else break;
		} // 빨강을 왼쪽으로 몰았을 때 빨강의 끝의 개수
		min = Math.min(min, red - count);
		count = 0;
		for(int i = b.length() - 1; 0 <= i; i--) {
			if(b.charAt(i) == 'R') count++;
			else break;
		} // 빨강을 오른쪽으로 몰았을 때 빨강의 끝의 개수
		min = Math.min(min, red - count);
		count = 0;
		for(int i = 0; i < a; i++) {
			if(b.charAt(i) == 'B') count++;
			else break;
		} // 파랑을 왼쪽으로 몰았을 때 파랑의 개수
		min = Math.min(min, blue - count);
		count = 0;
		for(int i = b.length() - 1; 0 <= i; i--) {
			if(b.charAt(i) == 'B') count++;
			else break;
		} // 파랑을 오른쪽으로 몰았을 때 파랑의 개수
		min = Math.min(min, blue - count);
		sb.append(min);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}
