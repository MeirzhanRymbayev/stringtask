package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    String sentence = ""; // ��� ��� null, � ������ �� �� ��������� ������ � ������������

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
     * @return
     */
    protected LinkedList<Word> splitSentenceIntoWords() {
        LinkedList<Word> wordList = new LinkedList<Word>();
        String[] words = this.sentence.split(" ");   // ��������� ����������� �� �����

        for (int i = 0; i < words.length; i++) {      //�������� �� ������
            wordList.add(new Word(words[i]));
        }

        return wordList;
    }

    @Override
    public String toString() {
        return sentence;
    }


}
