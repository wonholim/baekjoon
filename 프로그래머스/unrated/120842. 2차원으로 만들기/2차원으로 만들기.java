class Solution {
    public int[][] solution(int[] a, int n) {
        int[][] b = new int[a.length / n][n];
        int k = 0;
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < n; j++){
                b[i][j] = a[k];
                k++;
            }
        }
        return b;
    }
}