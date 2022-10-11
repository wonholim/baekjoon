import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        boolean check = true;
        for(char c : s.toCharArray()){
            if(check){
                if(c >= '0' && c <= '9'){
                    sb.append(c);
                }else if(c == ' '){
                    sb.append(' ');
                }else{
                    sb.append((char)(c - 32));    
                }
                check = false;
            }else{
                sb.append(c);
            }
            if(c == ' ') check = true;
        }
        return sb.toString();
    }
}