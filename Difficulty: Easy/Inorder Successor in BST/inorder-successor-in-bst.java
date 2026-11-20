/*
Definition for Node
class Node {
	public int data;
	public Node left;
	public Node right;
	
	public Node(int val) {
		data = val;
		left = right = null;
	}
};
*/

class Solution {
	private Node ans = null;
	public int inOrderSuccessor(Node root, Node k) {
		// code here
		dfs(root, k);
		return (ans != null) ? ans.data : -1;
	}
	private void dfs(Node root, Node k) {
		if (root == null)
			return;
		if (root.data <= k.data) {
			dfs(root.right, k);
		} 
		else {
			ans = root;
			dfs(root.left, k);
		}
	}
}