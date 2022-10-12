class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return (double)sum / numbers.length;
    }
}