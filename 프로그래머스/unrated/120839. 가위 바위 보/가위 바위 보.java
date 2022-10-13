class Solution {
    public String solution(String rsp) {
        String f = "";
        for(char c : rsp.toCharArray()){
            if(c == '2'){
                f += "0";
            }else if(c == '0'){
                f += "5";
            }else{
                f += "2";
            }
        }
        return f;
    }
}