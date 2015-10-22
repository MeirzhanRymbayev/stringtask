package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 22.10.2015.
 */
public class WorkWithText {

    private List<Word> sentenceWords = new LinkedList<Word>();



    /**
     *  Text will be prepared for work when this method will be called.
     *  Text will be trimmed and all space sequences will be replaced by one
     * @param textNeedPrepares textSentences which will be prepared to work
     * @return return prepared textSentences
     */
    private String prepareText(String textNeedPrepares) {
        textNeedPrepares = textNeedPrepares.trim();  // ќбрезаем усики
        String preparedText = textNeedPrepares.replaceAll("\\s{2,}", " ");
        return  preparedText;
    }

    /**
     *
     * @param text
     * @return
     */
    protected List<Sentence> splitTextIntoSentences(String text){
        text = prepareText(text);
        String[] sentences = text.split("(\\?|!|\\.)");         // –азбил текст на предложени€.
        List<Sentence> listOfSentence = new LinkedList<Sentence>();
        for(String sentence : sentences){
            listOfSentence.add(new Sentence(sentence));
        }
        return listOfSentence;
    }

    /**
     *
     * @param sentence
     * @return
     */
    protected List<Word> splitSentenceIntoWords(Sentence sentence) {
        List<Word> wordList = new LinkedList<Word>();
            String[] words = sentence.sentence.split(" ");   // разбиваем предложени€ на слова

            for (int j = 0; j < words.length; j++) {      //проходим по словам
                String word = words[j];
                wordList.add(new Word(word));
            }

        return wordList;
    }
}
