package com.epam.task2;
/*Task2
Создать программу обработки текста учебника по программированию с использованием классов:
Символ, Слово, Предложение, Знак препинания и др.
Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.epam.task2.WorkWithText;

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String fileName = "D:\\File1.txt";
        if(fileName.isEmpty()){
            System.out.println("Поле пустое!"); // надо прикрутить сюда проверку значения. Исключение
        }
        String textFromFile = WorkWithText.getTextFromFile(fileName);

        Text text = new Text(textFromFile);   // здесь есть какой то текст из файла. Отредактированный







        Word word = new Word("Спасибо");
        List<Symbol> listOfSymbol = word.splitWordIntoSymbol();
        for(Symbol symbol : listOfSymbol){
            System.out.println(symbol.symbol);
        }


















        //System.out.println(textSentences);
        //String textInFile = textSentences.toString();
        //Pattern p = Pattern.compile(".+(\\?|!|\\.).*");
        //Matcher m = p.matcher(textInFile);
        //System.out.println(textInFile);
        //textInFile = textInFile.trim();  // Обрезаем усики
        //System.out.println(textInFile);
        //textInFile = textInFile.replaceAll("\\s{2,}", " ");  // заменяем последовательность пробелов на один пробел
        //System.out.println(textInFile);
        //String[] sentences = textInFile.split("(\\?|!|\\.)");   // Разбил текст на предложения.
        //                                                        // Разбивается с потерей знаков препинания
        //textOfFile.addAll(Arrays.asList(sentences));
        //for (String wordsOfSentence : textOfFile) {
        //    System.out.println(wordsOfSentence);
        //}


    }

}