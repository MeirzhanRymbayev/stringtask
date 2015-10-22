package com.epam.task2;
/*Task2
Создать программу обработки текста учебника по программированию с использованием классов:
Символ, Слово, Предложение, Знак препинания и др.
Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
*/

/*5.	В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.*/

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {


        /*LinkedList<Integer> list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Integer first = list.getFirst();
        Integer last = list.getLast();

        list.set(0, last);
        list.set(list.size() - 1, first);
        System.out.println(list);*/

        String pathToFile = "D:\\File1.txt";
        if (pathToFile.isEmpty()) {
            System.out.println("Поле пустое!"); // надо прикрутить сюда проверку значения. Исключение
        }
        String textInFile = WorkWithText.getTextFromFile(pathToFile);

        Text text = new Text(textInFile);   // здесь есть какой то текст из файла. Отредактированный

        List<Sentence> list = WorkWithText.reverseWordsInSentences(text);
        for (Sentence sentence : list) {
            System.out.println(sentence);
        }

        /*Word word = new Word("Спасибо");
        List<Symbol> listOfSymbol = word.splitWordIntoSymbol();
        for (Symbol symbol : listOfSymbol) {
            System.out.println(symbol.symbol);
        }*/


    }

}