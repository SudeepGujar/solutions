package leetcode.aug2020;

import java.util.Objects;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3417/
 */

/*

You are given a binary tree in which each node contains an integer value.

Find the number of paths that sum to a given value.

The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.

Example:

root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

      10
     /  \
    5   -3
   / \    \
  3   2   11
 / \   \
3  -2   1

Return 3. The paths that sum to 8 are:

1.  5 -> 3
2.  5 -> 2 -> 1
3. -3 -> 11
 */

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (Objects.isNull(root)) {
            return 0;
        }
        final int current = nodeSum(root, sum);

        return current
                + pathSum(root.left, sum)
                + pathSum(root.right, sum);
    }

    private int nodeSum(TreeNode root, int sum) {
        if (Objects.isNull(root)) {
            return 0;
        }

        final int newSum = sum - root.val;
        final int possibleCount = nodeSum(root.left, newSum) + nodeSum(root.right, newSum);
        return newSum == 0 ? 1 + possibleCount: possibleCount;
    }
}


/**
 * Definition for a binary tree node.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}