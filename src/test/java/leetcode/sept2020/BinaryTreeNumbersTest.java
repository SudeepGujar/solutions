package leetcode.sept2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNumbersTest {
    private final BinaryTreeNumbers binaryTreeNumbers = new BinaryTreeNumbers();
    @Test
    void example1(){
        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(0), new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        int result = binaryTreeNumbers.sumRootToLeaf(root);
        assertEquals(22, result);
    }

    @Test
    void example2(){
        TreeNode root = new TreeNode(1, new TreeNode(0, null, new TreeNode(1)), new TreeNode(1, new TreeNode(0), new TreeNode(1)));
        int result = binaryTreeNumbers.sumRootToLeaf(root);
        assertEquals(18, result);
    }

}