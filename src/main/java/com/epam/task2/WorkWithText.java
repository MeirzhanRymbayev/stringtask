package com.epam.task2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 22.10.2015.
 */
public class WorkWithText {

    /**
     * Method takes unformatted text from file then makes prepare to work with text
     *
     * @return Return prepared text from file.
     */
    protected static List<String> getTextFromFile() {
        List<String> textRead = null;
        BufferedReader reader;
        String pathToFile;
        boolean checkPathToFile = false;
            while(checkPathToFile != true) {
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        pathToFile = reader.readLine();
                        if (pathToFile.isEmpty()) {
                            System.out.println("Поле пустое!"); // надо прикрутить сюда проверку значения. Исключение
                        } else {
                            textRead = Files.readAllLines(Paths.get(pathToFile), Charset.defaultCharset());
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found!");
                    } catch (IOException e) {
                        System.out.println("IOException found!");
                    }
                    if(textRead != null) break;
            }
        return textRead;
    }

    /**
     * Text will be prepared for work when this method will be called.
     * Text will be trimmed and all space sequences will be replaced by one
     *
     * @param textNeedPrepares textLines which will be prepared to work
     * @return return prepared textLines
     */
    protected static String prepareText(String textNeedPrepares) {
        textNeedPrepares = textNeedPrepares.trim();  // Обрезаем усики
        String preparedText = textNeedPrepares.replaceAll("\\s{2,}", " ").replaceAll("\\t{2,}", " ");
        return preparedText;
    }

    /**
     * Method reverse first and last words in every sentence
     *
     * @return Method returns text with reverse in first and last words in sentences
     */
    protected static List<Sentence> reverseFirstLastWordsInSentences() {
        List<Sentence> afterReverseWordsInSentence = new LinkedList<Sentence>();
        List<Paragraph> paragraphsList;
        List<Sentence> sentencesList;
        LinkedList<Word> listOfWords;


        Text textFromFile = new Text(WorkWithText.getTextFromFile());
        paragraphsList = textFromFile.splitTextIntoParagraphs();
        for (Paragraph paragraph : paragraphsList) {
            sentencesList = paragraph.splitParagraphIntoSentences();
            for(Sentence sentence : sentencesList){
                listOfWords = sentence.splitSentenceIntoWords();
                int indexOfLastWord = listOfWords.size() - 1;
                Word firstWord = new Word(listOfWords.getFirst().word);
                Word lastWord = new Word(listOfWords.getLast().word);
                listOfWords.set(0, lastWord);
                listOfWords.set(indexOfLastWord, firstWord);
                afterReverseWordsInSentence.add(new Sentence(listOfWords));
            }
        }
        return afterReverseWordsInSentence;

    }


}
