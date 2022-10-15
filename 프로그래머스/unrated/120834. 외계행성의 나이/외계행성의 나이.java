class Solution {
    public String solution(int a) {
        String b = "";
        for(char c : Integer.toString(a).toCharArray()){
            b += (char)(c - '0' + 'a');
        }
        return b;
    }
}