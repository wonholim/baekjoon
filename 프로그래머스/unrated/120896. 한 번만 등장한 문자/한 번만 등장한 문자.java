class Solution {
    public String solution(String s) {
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c - 'a']++;
        }
        String c = "";
        for(int i = 0; i < 26; i++){
            if(a[i] == 1) c += (char)(i + 'a');
        }
        return c;
    }
}