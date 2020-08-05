package leetcode.aug2020;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3413/
 *
 * Design a data structure that supports the following two operations:
 *
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 *
 * Example:
 *
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 */

public class AddAndSearchWord {

    private final Node root;

    public class Node{
        public char c;
        public Map<Character,Node > nextNodes= new HashMap<>();
        public boolean isLast=false;


        public Node(char c) {
            this.c = c;
        }
    }

    /** Initialize your data structure here. */
    public AddAndSearchWord() {
        root = new Node('0');

    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            if (!node.nextNodes.containsKey(c)) {
                node.nextNodes.put(c, new Node(c));
            }
            node = node.nextNodes.get(c);
        }
        node.isLast=true;
    }


    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(Node node, String word) {
        if (word.isEmpty()){
            return node.isLast;
        }
        final char c = word.charAt(0);
        if(c=='.'){
            return node.nextNodes.entrySet().stream().anyMatch(e-> search(e.getValue(), word.substring(1)));
        }
        if(!node.nextNodes.containsKey(c)){
            return false;
        }
        return search(node.nextNodes.get(c), word.substring(1));
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */