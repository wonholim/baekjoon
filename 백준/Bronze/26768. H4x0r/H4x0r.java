import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String line = br.readLine();
        for(char c : line.toCharArray()){
            if(c == 'a'){
               sb.append(4);
            }else if(c == 'e'){
               sb.append(3);
            }else if(c == 'i'){
               sb.append(1);
            }else if(c == 'o'){
               sb.append(0);
            }else if(c == 's'){
               sb.append(5);
            }else {
               sb.append(c);       
            }
        }
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

}