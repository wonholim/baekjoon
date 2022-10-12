import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) list.add(i);
        }
        return list.stream()
	                .mapToInt(Integer::intValue)
    	            .toArray();
    }
}