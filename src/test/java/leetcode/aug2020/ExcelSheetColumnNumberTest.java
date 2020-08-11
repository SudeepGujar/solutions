package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnNumberTest {

    private final ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
    @Test
    void example1() {
        final int result = excelSheetColumnNumber.titleToNumber("A");
        assertEquals(1, result);
    }

    @Test
    void example2() {
        final int result = excelSheetColumnNumber.titleToNumber("AB");
        assertEquals(28, result);
    }

    @Test
    void example3() {
        final int result = excelSheetColumnNumber.titleToNumber("ZY");
        assertEquals(701, result);
    }

    @Test
    void example4() {
        final int result = excelSheetColumnNumber.titleToNumber("AAA");
        assertEquals(703, result);
    }
}