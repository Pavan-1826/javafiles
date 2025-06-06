class Solution {
    private int preorderIndex = 0;
    private Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeHelper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        int inorderRootIndex = inorderIndexMap.get(rootValue);
        root.left = buildTreeHelper(preorder, left, inorderRootIndex - 1);
        root.right = buildTreeHelper(preorder, inorderRootIndex + 1, right);
        return root;
    }
}
