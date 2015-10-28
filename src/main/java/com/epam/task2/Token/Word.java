package com.epam.task2.Token;

import com.epam.task2.Symbol;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Word extends Token {

    private List<Symbol> symbols;

    public Word(List<Symbol> listOfSymbol) {
        symbols = new LinkedList<Symbol>();
        for (Symbol symbol : listOfSymbol) {
            for (Symbol symbol1 : listOfSymbol) {
                symbols.add(symbol);
            }
        }
    }

    /*protected List<Symbol> splitWordIntoSymbol() {
        List<Symbol> symbolList = new LinkedList<Symbol>();
        char[] wordsCharArray = this.symbols.toCharArray();
        for (char charOfWord : wordsCharArray) {

            symbolList.add(new Symbol(charOfWord));
        }
        return symbolList;
    }*/

}
