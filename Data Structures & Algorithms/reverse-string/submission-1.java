class Solution {
    public void reverseString(char[] s) {
        char temp;
        int n= s.length,left=0, right=n-1;
        while(left < right) {
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}