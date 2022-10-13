class Solution {
    public String solution(String b, int n) {
        String a = "";
        for(int i = 0 ; i < b.length(); i++){
            for(int j = 0; j < n; j++){
                a += b.charAt(i);
            }
        }
        return a;
    }
}