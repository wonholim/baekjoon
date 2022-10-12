class Solution {
    public int[] solution(int[] a) {
        int[] b = new int[a.length];
        int j = b.length - 1;
        for(int i = 0; i < a.length; i++){
            b[j] = a[i];
            j--;
        }
        return b;
    }
}