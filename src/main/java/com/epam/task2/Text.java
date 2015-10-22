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
            this.text += sentence.sentence + " ";
            this.text.trim();
        }
    }

    /**
     * This method splits the text into sentences
     * @return
     */
    protected List<Sentence> splitTextIntoSentences(){
        this.text = WorkWithText.prepareText(this.text);
        /*–азбить текст если встречаютс€ знаки . ? ! ... */
        String[] sentences = this.text.split("(\\?|!|\\.|\\.{3})");
        List<Sentence> listOfSentence = new LinkedList<Sentence>();

            for(String sentence : sentences){
                listOfSentence.add(new Sentence(sentence));
            }

        return listOfSentence;
    }




}
