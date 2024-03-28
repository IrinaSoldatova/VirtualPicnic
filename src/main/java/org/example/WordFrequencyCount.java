package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {
    private final Map<String, Integer> wordFrequency;

    public WordFrequencyCount() {
        this.wordFrequency = new HashMap<>();
    }

    public void addWord(String word) {
        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
    }

    public void printWordFrequency() {
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}