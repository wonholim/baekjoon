import java.util.*;
class Solution {
    public int solution(int[] a) {
        Arrays.sort(a);
        return a[a.length / 2];
    }
}