class Solution {
    public String solution(String a, String b) {
        String c = "";
        char k = (char)b.charAt(0);
        for(char g : a.toCharArray()){
            if(g != k){
                c += g;
            }
        }
        return c;
    }
}