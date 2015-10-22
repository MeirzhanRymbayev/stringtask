package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Text {
    List<Sentence> textSentences = new LinkedList<Sentence>();

    public Text(List<Sentence> textSentences){
        this.textSentences = textSentences;
    }

    /**
     *
     * @param text Text in file or some text
     * @return
     */
    protected List<Sentence> splitTextIntoSentences(String text){
        text = WorkWithText.prepareText(text);
        String[] sentences = text.split("(\\?|!|\\.|\\.{3})");         // Разбил текст на предложения.
        List<Sentence> listOfSentence = new LinkedList<Sentence>();

        for(String sentence : sentences){
            listOfSentence.add(new Sentence(sentence));
        }

        return listOfSentence;
    }




}
