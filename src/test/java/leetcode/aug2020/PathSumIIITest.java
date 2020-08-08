package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumIIITest {

    private final PathSumIII pathSumIII = new PathSumIII();

    /*

              r=10
          /        \
         rl=5      rr=-3
        /     \         \
    rll=3     rlr=2      rrr=11
    /    \         \
rlll=3  rllr=-2     rlrr1


     */
    @Test
    void pathSum() {
        final TreeNode rlll = new TreeNode(3);
        final TreeNode rllr = new TreeNode(-2);
        final TreeNode rlrr = new TreeNode(1);

        final TreeNode rll = new TreeNode(3, rlll, rllr);
        final TreeNode rlr = new TreeNode(2, null, rlrr);
        final TreeNode rrr = new TreeNode(11);

        final TreeNode rl = new TreeNode(5, rll, rlr);
        final TreeNode rr = new TreeNode(-3, null, rrr);
        TreeNode root = new TreeNode(10, rl, rr);

        final int result = pathSumIII.pathSum(root, 8);
        assertEquals(3, result);
    }
}