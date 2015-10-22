package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public Sentence(List<Word> wordsOfSentence) {
        for (Word word : wordsOfSentence) {
            this.sentence += word.word + " ";
            this.sentence.trim();
        }
    }

    /**
     * This method splits the sentence into words
     *
     *
     * @return
     */
    protected List<Word> splitSentenceIntoWords() {
        List<Word> wordList = new LinkedList<Word>();
        String[] words = this.sentence.split(" ");   // ��������� ����������� �� �����

        for (int j = 0; j < words.length; j++) {      //�������� �� ������
            String word = words[j];
            wordList.add(new Word(word));
        }

        return wordList;
    }


}
