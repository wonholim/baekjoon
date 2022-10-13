import java.util.*;

class Solution {
    public int[] solution(String a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(char c : a.toCharArray()){
            if(c >= '0' && c <= '9'){
                list.add(c - '0');
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}