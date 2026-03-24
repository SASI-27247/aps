class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Case 1: both nodes are null
        if (p == null && q == null) {
            return true;
        }
        
        // Case 2: one is null, one is not
        if (p == null || q == null) {
            return false;
        }
        
        // Case 3: values must match + check subtrees
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && 
                   isSameTree(p.right, q.right);
        }
        
        return false;
    }
}