class Solution {
    public int solution(int[] a) {
        int max = -999999999;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(max < a[i] * a[j]) max = a[i] * a[j];
            }
        }
        return max;
    }
}