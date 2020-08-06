package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInArrayTest {

    private final DuplicatesInArray duplicatesInArray = new DuplicatesInArray();

    @Test
    void findDuplicates() {
        final int[] nums = {4,3,2,7,8,2,3,1};
        final List<Integer> duplicates = duplicatesInArray.findDuplicates(nums);
        assertEquals(Arrays.asList(2,3), duplicates);
    }
}