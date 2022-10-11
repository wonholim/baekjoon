import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length - 1;
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i] * B[j];
            j--;
        }
        return sum;
    }
}