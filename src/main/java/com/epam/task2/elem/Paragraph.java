package com.epam.task2.elem;

import com.epam.task2.WorkWithText;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Paragraph {
    String paragraph = "";

    public Paragraph(String paragraph){
        this.paragraph = paragraph;
    }

    public Paragraph(List<Sentence> sentences){
        for (Sentence sentence : sentences) {
            this.paragraph +=sentence.sentence;
        }
    }

    /**
     * This method splits the text into sentences
     *
     * @return
     */
    protected List<Sentence> splitParagraphIntoSentences() {
        paragraph = WorkWithText.prepareText(paragraph);
        /*Разбить текст если встречаются знаки ?|!|.|... */
        String regexForFloatNumbers = "(\\.)(\\s|[\\D*])"; // For example 333.67 112.2
        String[] sentences = paragraph.split("(\\?|!|\\.{3})"+ "|" + regexForFloatNumbers);
        List<Sentence> listOfSentence = new LinkedList<Sentence>();

        /* Here we need to get and add punktuation mark*/
        for (String sentence : sentences) {
            listOfSentence.add(new Sentence(sentence));
        }

        return listOfSentence;
    }
}
