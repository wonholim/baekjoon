import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();
        String a = br.readLine();
        boolean start = false;
        if(a.equals("고무오리 디버깅 시작")) start = true;
        while(start) {
        	a = br.readLine();
        	if(a == null) break;
        	if(a.equals("문제")) s.push(1);
        	else if(a.equals("고무오리")) {
        		if(!s.isEmpty()) s.pop();
        		else { s.push(1); s.push(1); }
        	}else if(a.equals("고무오리 디버깅 끝")) break;
        }
        if(s.isEmpty()) sb.append("고무오리야 사랑해");
        else sb.append("힝구");
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
