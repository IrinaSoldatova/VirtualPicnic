package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            WordCounter wordCounter = new WordCounter();
            LongestWordSearch longestWordSearch = new LongestWordSearch();
            WordFrequencyCount wordFrequencyCount = new WordFrequencyCount();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCounter.countWord(word);
                longestWordSearch.searchLongestWord(word);
                wordFrequencyCount.addWord(word);
            }

            System.out.println("Total words: " + wordCounter.getTotalWords());
            System.out.println("Longest word: " + longestWordSearch.getLongestWords());
            System.out.println("Word frequency: ");
            wordFrequencyCount.printWordFrequency();

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}