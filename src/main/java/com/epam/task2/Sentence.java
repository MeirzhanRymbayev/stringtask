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

    /**
     * This method splits the sentence into words
     * @param sentence
     * @return
     */
    protected List<Word> splitSentenceIntoWords(Sentence sentence) {
        List<Word> wordList = new LinkedList<Word>();
        String[] words = sentence.sentence.split(" ");   // разбиваем предложения на слова

        for (int j = 0; j < words.length; j++) {      //проходим по словам
            String word = words[j];
            wordList.add(new Word(word));
        }

        return wordList;
    }




}
