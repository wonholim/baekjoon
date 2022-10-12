class Solution {
    public String solution(String b) {
        String a = "";
        for(char c : b.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                continue;
            }else{
                a += c;
            }
        }
        return a;
    }
}