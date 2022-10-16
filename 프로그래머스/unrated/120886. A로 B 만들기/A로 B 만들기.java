import java.util.*;
class Solution {
    public int solution(String a, String b) {
        char[] c = a.toCharArray();
        Arrays.sort(c);
        char[] d = b.toCharArray();
        Arrays.sort(d);
        String e = String.valueOf(c);
        String f = String.valueOf(d);
        
        return e.equals(f) ? 1 : 0;
    }
}