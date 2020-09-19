package leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailTest {
    private final UniqueEmail uniqueEmail = new UniqueEmail();
    @Test
    void example1() {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int result = uniqueEmail.numUniqueEmails(emails);
        assertEquals(2, result);
    }
}