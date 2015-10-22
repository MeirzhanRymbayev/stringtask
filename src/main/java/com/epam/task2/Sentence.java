package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Sentence {
    protected List<Word> words = new LinkedList<Word>();

    public Sentence(List<Word> sentence) {
        this.words = sentence;
    }

    /**
     *  Text will be prepared for work when this method will be called
     * @param text
     * @return
     */


}
