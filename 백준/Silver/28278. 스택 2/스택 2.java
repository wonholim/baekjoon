import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        LinkedList<Integer> s = new LinkedList<>();
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k == 1) {
                int x = Integer.parseInt(st.nextToken());
                s.add(x);
                continue;
            } else if (k == 2) {
                if (s.isEmpty()) sb.append(-1);
                else sb.append(s.removeLast());
            } else if (k == 3) {
                sb.append(s.size());
            } else if (k == 4) {
                if (s.isEmpty()) sb.append('1');
                else sb.append('0');
            } else {
                if (s.isEmpty()) sb.append(-1);
                else sb.append(s.get(s.size() - 1));
            }
            sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}