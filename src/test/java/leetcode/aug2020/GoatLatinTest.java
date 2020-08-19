package leetcode.aug2020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoatLatinTest {
    GoatLatin goatLatin = new GoatLatin();

    @Test
    void example1(){
        String result = goatLatin.toGoatLatin("I speak Goat Latin");
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", result);
    }

    @Test
    void example2(){
        String result = goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog");
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", result);
    }

}