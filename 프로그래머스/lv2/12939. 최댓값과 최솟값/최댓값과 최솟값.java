import java.util.*;
class Solution {
    public String solution(String s) {
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            list.add(Integer.parseInt(a[i]));
        }
        Collections.sort(list);
        sb.append(list.get(0) + " " + list.get(list.size() - 1));
        return sb.toString();
    }
}