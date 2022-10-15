class Solution {
    public int solution(int order) {
        int count = 0;
        for(char c : Integer.toString(order).toCharArray()){
            if(c == '3' || c == '6' || c == '9') count++;
        }
        return count;
    }
}