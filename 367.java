class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);
        if(n/(int)n==1)
            return true;
        return false;
        
        
    }
}
