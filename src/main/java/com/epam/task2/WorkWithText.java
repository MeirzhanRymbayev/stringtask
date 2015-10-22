package com.epam.task2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 22.10.2015.
 */
public class WorkWithText {

    /**
     * Method takes unformatted text from file then makes prepare to work with text
     * @param pathToFile Path to file which contains text
     * @return Return prepared text from file.
     */
    protected static String getTextFromFile(String pathToFile){
        StringBuilder text = new StringBuilder("");  /*Чтобы сэкономить ресурсы кучи используем StringBuilder а не String */

        String textInFile = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
            while (reader.ready()) {
                textInFile = reader.readLine();
                text = text.append(textInFile);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");;
        } catch (IOException e) {
            System.out.println("IOException found!");;
        }
        textInFile = text.toString();
        textInFile = prepareText(textInFile);
        return textInFile;
    }

    /**
     *  Text will be prepared for work when this method will be called.
     *  Text will be trimmed and all space sequences will be replaced by one
     * @param textNeedPrepares textSentences which will be prepared to work
     * @return return prepared textSentences
     */
    protected static String prepareText(String textNeedPrepares) {

        textNeedPrepares = textNeedPrepares.trim();  // Обрезаем усики
        String preparedText = textNeedPrepares.replaceAll("\\s{2,}", " ");
        return  preparedText;
    }

    /**
     * Method reverse first and last words in every sentence
     * @param textFromFile
     * @return
     */
    protected static List<Sentence> reverseWordsInSentences(Text textFromFile){
        List<Sentence> reverseWordsInSentence = textFromFile.splitTextIntoSentences();
        for(Sentence sentence : reverseWordsInSentence){
            List<Word> listOfWords = sentence.splitSentenceIntoWords();
            for
        }




    }






}
