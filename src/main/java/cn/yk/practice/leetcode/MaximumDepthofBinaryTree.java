package cn.yk.practice.leetcode;

import cn.yk.practice.basic_object.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * 后序遍历的简单应用，也可以使用层序遍历
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);
        return (leftMaxDepth > rightMaxDepth ? leftMaxDepth : rightMaxDepth) + 1;
    }
}
