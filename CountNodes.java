
class CountNodes {


      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        // Call countNodes to count the nodes in the binary tree
        CountNodes sol = new CountNodes();
        int res =sol.countNodes(root);

        // Print the result
        System.out.println("Number of nodes in the binary tree: " + res);
    }
}