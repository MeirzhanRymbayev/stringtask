package com.epam.task2;

/**
 * Created by Meir on 21.10.2015.
 */
public class Symbol {
    String symbol;
    public Symbol(String symbol){
        this.symbol = symbol;
    }

    public Symbol (char charOfWord){
        symbol = String.valueOf(charOfWord);
    }
}
