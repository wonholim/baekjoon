class Solution {
    public String solution(String b) {
        String a = "";
        for(int i = b.length() - 1; 0 <= i; i--){
            a += b.charAt(i);
        }
        return a;
    }
}