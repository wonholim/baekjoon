class Solution {
    public int solution(int num, int k) {
        int a = 1;
        for(char c : Integer.toString(num).toCharArray()){
            if(c - '0' == k){
                break;
            }else{
                a++;
            }
        }
        if(a > Integer.toString(num).length()) return -1;
        return a;
    }
}