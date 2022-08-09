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
        Stack<Integer> s = new Stack<>();
        int count = 1;
        int max = 0;
        while(a --> 0) {
        	s.push(Integer.parseInt(br.readLine()));
        }
        int b = s.pop();
        while(!s.isEmpty()) {
        	int c = s.pop();
        	if(c > max) {
        		max = c;
            	if(max > b) {
            		count++;
            	}
        	}
        }
        sb.append(count);
		bw.write(sb.toString());	
		bw.flush();
		bw.close();
		br.close();
	}

}
