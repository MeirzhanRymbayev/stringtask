package com.epam.task2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Word {
    protected String word;

    public Word(String word){
        this.word = word;
    }

    public Word(List<Symbol> listOfSymbol){
        for(Symbol symbol : listOfSymbol){
            this.word = this.word + symbol.symbol;
        }
    }

    protected List<Symbol> splitWordIntoSymbol(){
        List<Symbol> symbolList = new LinkedList<Symbol>();
        char[] wordsCharArray = this.word.toCharArray();
        for(char charOfWord : wordsCharArray){

            symbolList.add(new Symbol(charOfWord));
        }
        return symbolList;
    }

}
