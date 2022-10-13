class Solution {
    public String solution(String b) {
        String a = "";
        for(char c : b.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                a += (char)(c - ' ');
            }else{
                a += (char)(c + ' ');
            }
        }
        return a;
    }
}