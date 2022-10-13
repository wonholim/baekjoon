import java.util.*;
class Solution {
    public int[] solution(int n, int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            if(a[i] % n == 0) list.add(a[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}