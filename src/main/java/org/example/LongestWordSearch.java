package org.example;

import java.util.ArrayList;

public class LongestWordSearch {
    private int longestLength;
    private ArrayList<String> longestWords;

    public LongestWordSearch() {
        this.longestLength = 0;
        this.longestWords = new ArrayList<>();
    }

    public void searchLongestWord(String word) {
        if (word.length() > longestLength) {
            longestLength = word.length();
            longestWords.clear();
            longestWords.add(word);
        } else if (word.length() == longestLength) {
            if (!longestWords.contains(word)) {
                longestWords.add(word);
            }
        }
    }

    public ArrayList<String> getLongestWords() {
        return longestWords;
    }
}
