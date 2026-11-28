/*Structure of the node class is
class Node
{
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
} */

class Solution {
  int index = 0;
  Node binaryTreeToBST(Node root) {
    List<Integer> nums = new ArrayList<>();
    dfs(nums, root);
    Collections.sort(nums);
    index = 0;
    updateBST(nums, root);
    return root;
  }
  public void dfs(List<Integer> nums, Node root) {
    if (root == null)
      return;
    nums.add(root.data);
    dfs(nums, root.left);
    dfs(nums, root.right);
  }
  public void updateBST(List<Integer> nums, Node root) {
    if (root == null)
      return;
    updateBST(nums, root.left);
    root.data = nums.get(index++);
    updateBST(nums, root.right);
  }
}