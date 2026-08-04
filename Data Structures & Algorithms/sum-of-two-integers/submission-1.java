class Solution {
    public int getSum(int a, int b) {
        int sum= 0;
        while(a != 0 || b != 0) {
            if(a > 0) {
                sum++;a--;
            } else if(a < 0) {
                sum--;a++;
            }
            if(b > 0) {
                sum++;b--;
            } else if(b < 0) {
                sum--;b++;
            }            
        }
        return sum;
    }
}
