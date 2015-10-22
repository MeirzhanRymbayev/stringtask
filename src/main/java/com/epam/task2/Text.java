package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Text {
    String text;
    List<Sentence> textSentences = new LinkedList<Sentence>();

    public Text(List<Sentence> sentencesOfText){
        for(Sentence sentence : sentencesOfText){
            text += sentence.sentence + " ";
            text.trim();
        }
    }

    /**
     * This method splits the text into sentences
     * @param text Text in file or some text
     * @return
     */
    protected List<Sentence> splitTextIntoSentences(String text){
        text = WorkWithText.prepareText(text);
        /*–азбить текст если встречаютс€ знаки . ? ! ... */
        String[] sentences = text.split("(\\?|!|\\.|\\.{3})");
        List<Sentence> listOfSentence = new LinkedList<Sentence>();

            for(String sentence : sentences){
                listOfSentence.add(new Sentence(sentence));
            }

        return listOfSentence;
    }




}
