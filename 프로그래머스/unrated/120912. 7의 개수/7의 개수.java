class Solution {
    public int solution(int[] array) {
        int a = 0;
        for(int i = 0; i < array.length; i++){
            for(char c : Integer.toString(array[i]).toCharArray()){
                if(c == '7') a++;
            }
        }
        return a;
    }
}