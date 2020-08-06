package leetcode.aug2020;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddAndSearchWordTest {
    private final AddAndSearchWord addAndSearchWord = new AddAndSearchWord();

    @BeforeEach
    void setup(){
        addAndSearchWord.addWord("bad");
        addAndSearchWord.addWord("mad");
        addAndSearchWord.addWord("dad");
    }

    @Test
    void example1(){
        assertFalse(addAndSearchWord.search("pad"));
    }

    @Test
    void example2(){
        assertTrue(addAndSearchWord.search("bad"));
    }

    @Test
    void example3(){
        assertTrue(addAndSearchWord.search(".ad"));
    }

    @Test
    void example4(){
        assertTrue(addAndSearchWord.search("..d"));
    }
}