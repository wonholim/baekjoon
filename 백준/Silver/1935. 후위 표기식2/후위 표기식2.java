import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String b = br.readLine();
        Stack<Double> s = new Stack<>();
        int[] q = new int[a];
        for(int i = 0; i < a; i++) {
        	q[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < b.length(); i++) {
        	char c = b.charAt(i);
        	if(c != '*' && c != '+' && c != '-' && c != '/') {
        		s.push((double)q[c - 65]);
        	}else {
        		double d = s.pop();
        		double e = s.pop();
        		if(c == '*') {
        			s.push(e * d);
        		}else if(c == '+') {
        			s.push(e + d);
        		}else if(c == '-') {
        			s.push(e - d);
        		}else if(c == '/') {
        			s.push(e / d);
        		}
        	}
        }
        sb.append(String.format("%.2f", s.pop()));
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
