package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public Sentence(List<Word> wordsOfSentence) {
        for(Word word : wordsOfSentence){
            sentence += word.word + " ";
            sentence.trim();
        }
    }




}
