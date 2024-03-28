package org.example;

public class WordCounter {
    private int totalWords;

    public WordCounter() {
        this.totalWords = 0;
    }

    public void countWord(String word) {
        totalWords++;
    }

    public int getTotalWords() {
        return totalWords;
    }
}

