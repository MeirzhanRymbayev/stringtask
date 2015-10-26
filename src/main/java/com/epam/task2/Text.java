package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Text {
    List<String> textLines = new LinkedList<String>();


    public Text(List<String> paragraphsOfText) {
        this.textLines = paragraphsOfText;
    }

    /**
     * This method splits the text into sentences
     *
     * @return
     */
    protected List<Paragraph> splitTextIntoParagraphs() {
        List<Paragraph> listOfParagraphs = new LinkedList<Paragraph>();
        List<String> preparedParagraphLines = new LinkedList<String>(this.textLines);

            for(String stringFromTextList : this.textLines){
                if(stringFromTextList.equals("")){
                    preparedParagraphLines.remove(stringFromTextList); // here empty string will be deleted
                }
            }
            for(String notPreparedParagraph : preparedParagraphLines) {
                String preparedParagraph = WorkWithText.prepareText(notPreparedParagraph);
                listOfParagraphs.add(new Paragraph(preparedParagraph));
            }
        return listOfParagraphs;
    }




}
