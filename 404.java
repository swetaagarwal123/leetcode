class Solution {
    public int sum ;
    public void helper(TreeNode root) {
        if(root == null) {
            return ;
        }
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null) {
                sum += root.left.val ;
            }
            else {
                helper(root.left);
            }
        }
        if(root.right != null) {
            helper(root.right);
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0 ;
        helper(root);
        return sum ;
    }
}
