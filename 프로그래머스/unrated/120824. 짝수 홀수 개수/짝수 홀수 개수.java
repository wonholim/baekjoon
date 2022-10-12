class Solution {
    public int[] solution(int[] c) {
        int a = 0;
        for(int i = 0; i < c.length; i++){
            if(c[i] % 2 == 0) a++;
        }
        return new int[] {a, c.length - a};
    }
}