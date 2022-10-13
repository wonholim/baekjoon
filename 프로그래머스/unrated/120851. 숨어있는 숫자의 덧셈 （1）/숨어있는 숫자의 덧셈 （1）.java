class Solution {
    public int solution(String b) {
        int a = 0;
        for(char c : b.toCharArray()){
            if(c > '0' && c <= '9'){
                a += c - '0';
            }
        }
        return a;
    }
}