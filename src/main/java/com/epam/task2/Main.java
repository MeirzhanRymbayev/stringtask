package com.epam.task2;
/*Task2
Создать программу обработки текста учебника по программированию с использованием классов:
Символ, Слово, Предложение, Знак препинания и др.
Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
*/

/*5.	В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.*/

import java.io.IOException;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String pathToFile = "D:\\File1.txt";
        if (pathToFile.isEmpty()) {
            System.out.println("Поле пустое!"); // надо прикрутить сюда проверку значения. Исключение
        }
        String textInFile = WorkWithText.getTextFromFile(pathToFile);

        Text text = new Text(textInFile);   // здесь есть какой то текст из файла. Отредактированный

        List<Sentence> list = WorkWithText.reverseWordsInSentences(text);
        for(Sentence sentence : list){
            System.out.println(sentence);
        }

        /*Word word = new Word("Спасибо");
        List<Symbol> listOfSymbol = word.splitWordIntoSymbol();
        for (Symbol symbol : listOfSymbol) {
            System.out.println(symbol.symbol);
        }*/


    }

}