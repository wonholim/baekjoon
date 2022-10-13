class Solution {
    public String solution(String q, int w, int e) {
        char a = q.charAt(w);
        char b = q.charAt(e);
        String f = "";
        for(int i = 0; i < q.length(); i++){
            if(i == w){
                f += b;
            }else if(i == e){
                f += a;
            }else{
                f += q.charAt(i);
            }
        }
        return f;
    }
}