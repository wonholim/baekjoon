import java.util.*;
class Solution {
    public String solution(String a) {
        a = a.toLowerCase();
        String[] b = a.split("");
        Arrays.sort(b);
        return String.join("", b);
    }
}