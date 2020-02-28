/**
 *
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its minimum depth = 2.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode a) {
        if (a == null) return 0;
        if (a.left == null && a.right == null) {
            return 1;
        }
        if (a.left == null) {
            return 1+minDepth(a.right);
        }
        else if (a.right == null) return 1+minDepth(a.left);
        int left = minDepth(a.left);
        int right = minDepth(a.right);
        return 1+Math.min(left, right);
    }
}