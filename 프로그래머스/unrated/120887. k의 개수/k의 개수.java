class Solution {
    public int solution(int i, int j, int k) {
        int d = 0;
        for(int a = i; a <= j; a++){
            for(char c : Integer.toString(a).toCharArray()){
                if(k == c - '0'){
                    d++;
                }
            }
        }
        return d;
    }
}