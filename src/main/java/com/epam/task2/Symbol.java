package com.epam.task2;

/**
 * Created by Meir on 21.10.2015.
 */
public class Symbol {

    private char symbol;

    public Symbol(char symbol){
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Symbol value = (Symbol) obj;

        if (symbol != value.symbol) {
            return false;
        }

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return (int) symbol;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return Character.toString(symbol);
    }

}
