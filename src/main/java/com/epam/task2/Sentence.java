package com.epam.task2;

import com.epam.task2.Token.Token;
import com.epam.task2.Token.Word;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    private List<Token> tokens;

    public Sentence(List<Token> listOfTokens) {
        tokens  = new LinkedList<Token>();
        for (Token token : listOfTokens) {
            this.tokens.add(token);
        }
    }

    public Sentence(LinkedList<Word> wordsOfSentence) {
        for (Word words : wordsOfSentence) {
            this.sentence += words.symbols + " ";
            this.sentence.trim();
        }
    }

    /**
     * This method splits the sentence into words
     *
     * @return
     */
    /*protected LinkedList<Word> splitSentenceIntoWords() {
        LinkedList<Word> wordList = new LinkedList<Word>();
        String[] words = this.sentence.split(" ");   // разбиваем предложения на слова

        for (int i = 0; i < words.length; i++) {      //проходим по словам
            wordList.add(new Word(words[i]));
        }
        return wordList;
    }*/




}
