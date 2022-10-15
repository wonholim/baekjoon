class Solution {
    public String solution(String a, int b) {
        String c = "";
        for(int i = 1; i <= a.length(); i++){
            if(i % b == 0){
                c += a.charAt(i - 1);
            }
        }
        return c;
    }
}