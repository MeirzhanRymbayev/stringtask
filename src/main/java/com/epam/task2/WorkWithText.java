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
    public static String prepareText(String textNeedPrepares) {
        textNeedPrepares = textNeedPrepares.trim();  // Обрезаем усики
        String preparedText = textNeedPrepares.replaceAll("\\s{2,}", " ");
        return  preparedText;
    }




}
