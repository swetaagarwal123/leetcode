class Solution {
    public void moveZeroes(int[] nums) {
        int LastNonZeroFoundAt = 0;
        for(int i =0; i<nums.length; i++){
           if (nums[i] != 0){
             nums [LastNonZeroFoundAt] = nums[i];
             LastNonZeroFoundAt++;
           }
        }
        for (int i= LastNonZeroFoundAt ; i< nums.length; i++){
          nums[i]=0;
        }
        
    }
}
