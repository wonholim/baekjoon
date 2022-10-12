class Solution {
    public int solution(int[] a, int b) {
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(b < a[i]) count++;
        }
        return count;
    }
}