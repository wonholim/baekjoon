class Solution {
    public int[] solution(int[] a, String b) {
        int[] c = new int[a.length];
        if(b.equals("right")){
            c[0] = a[a.length - 1];
            for(int i = 1; i < a.length; i++){
                c[i] = a[i - 1];
            }    
        }else{
            c[a.length - 1] = a[0];
            for(int i = 0; i < a.length - 1; i++){
                c[i] = a[i + 1];
            }    
        }
        return c;
    }
}