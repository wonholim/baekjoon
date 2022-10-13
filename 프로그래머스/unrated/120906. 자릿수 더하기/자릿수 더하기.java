class Solution {
    public int solution(int n) {
        int a = 0;
        for(char c : Integer.toString(n).toCharArray()){
            a += c - '0';
        }
        return a;
    }
}