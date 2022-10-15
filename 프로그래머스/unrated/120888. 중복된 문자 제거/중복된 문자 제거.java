import java.util.*;
class Solution {
    public String solution(String b) {
        String a = ""; 
        ArrayList<Character> list = new ArrayList<>();
        for(char c : b.toCharArray()){
            if(!list.contains(c)) list.add(c);
        }
        for(char c : list){
            a += c;
        }
        return a;
    }
}