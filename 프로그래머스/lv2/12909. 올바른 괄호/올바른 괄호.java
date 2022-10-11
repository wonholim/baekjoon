import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if(s.length() % 2 != 0) return false;
        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '('){
            answer = false;
            return false;
        }
        int o = 0;

        for(char c : s.toCharArray()){
            if(c == '(') o++;
            else if(c == ')' && o > 0) o--;
            else return false;
        }
        if(o == 0){
            return answer;
        }else{
            return false;
        }
    }
}