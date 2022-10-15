class Solution {
    public int[] solution(int[] a) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
                index = i;
            }
        }
        return new int[] {max, index};
    }
}