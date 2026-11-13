/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
} */

class Solution {
	public ArrayList<Integer> inOrder(Node root) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		in(root, ans);
		return ans;
		
	}
	void in(Node root, ArrayList<Integer> ans) {
		if (root == null) {
			return;
		}
		in(root.left, ans);
		ans.add(root.data);
		in(root.right, ans);
	}
}
