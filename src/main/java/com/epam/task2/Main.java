package com.epam.task2;
/*Task2
Создать программу обработки текста учебника по программированию с использованием классов:
Символ, Слово, Предложение, Знак препинания и др.
Во всех задачах с формированием текста заменять табуляции и последовательности пробелов одним пробелом.
*/

/*5.	В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<Sentence> reversedSentences = WorkWithText.reverseFirstLastWordsInSentences();
        for (Sentence sentence : reversedSentences) {
            System.out.println(sentence.sentence);
        }
    }

}