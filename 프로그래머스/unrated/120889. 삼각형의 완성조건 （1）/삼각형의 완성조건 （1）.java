import java.util.*;
class Solution {
    public int solution(int[] a) {
        Arrays.sort(a);
        return a[0] + a[1] > a[2] ? 1 : 2;
    }
}