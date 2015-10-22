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

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /*Path path = Paths.get("D:\\File1.txt");
    Charset charset = Charset.forName("UTF-8");
        List<String> textSentences = null;
        try {
            textSentences = Files.readAllLines(path, StandardCharsets.UTF_8);

            for (String line : textSentences) {
                System.out.println(line);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }*/

        List<String> textOfFile = new ArrayList<String>();
        String fileName1 = "D:\\File1.txt";

        StringBuilder text = new StringBuilder("");

        String line = null;
        BufferedReader reader = new BufferedReader(new FileReader(fileName1));

        while (reader.ready()) {
            line = reader.readLine();
            text = text.append(line);
        }


        WorkWithText workWithText = new WorkWithText();
        Sentence sentence = new Sentence(workWithText.splitSentenceIntoWords(text.toString())) ;
        for (Word word : sentence.wordsOfSentence){
            System.out.println(word.word);
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