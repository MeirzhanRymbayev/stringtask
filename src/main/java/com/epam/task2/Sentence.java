package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    String sentence = ""; // Тут был null, и почему то он выводился вместе с результатами

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(LinkedList<Word> wordsOfSentence) {
        for (Word words : wordsOfSentence) {
            this.sentence += words.word + " ";
            this.sentence.trim();
        }
    }

    /**
     * This method splits the sentence into words
     *
     * @return
     */
    protected LinkedList<Word> splitSentenceIntoWords() {
        LinkedList<Word> wordList = new LinkedList<Word>();
        String[] words = this.sentence.split(" ");   // разбиваем предложения на слова

        for (int i = 0; i < words.length; i++) {      //проходим по словам
            wordList.add(new Word(words[i]));
        }
        return wordList;
    }




}
