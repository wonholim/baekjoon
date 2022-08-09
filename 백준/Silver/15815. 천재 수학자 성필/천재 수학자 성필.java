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
        String[] a = br.readLine().split("");
        for(int i = 0; i < a.length; i++) {
        	if(!a[i].equals("-") && !a[i].equals("/") && !a[i].equals("*") && !a[i].equals("+")) {
        		s.push(Integer.parseInt(a[i]));
        	}else {
        		int c = s.pop();
        		int b = s.pop();
        		if(a[i].equals("+")) {
        			s.push(b + c);
        		}else if(a[i].equals("*")) {
        			s.push(b * c);
        		}else if(a[i].equals("/")) {
        			s.push(b / c);
        		}else if(a[i].equals("-")) {
        			s.push(b - c);
        		}
        	}
        }
        sb.append(s.pop());
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
