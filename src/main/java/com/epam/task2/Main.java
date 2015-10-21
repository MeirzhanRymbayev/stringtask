package com.epam.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Meir on 21.10.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        /*Path path = Paths.get("D:\\File1.txt");
    Charset charset = Charset.forName("UTF-8");
        List<String> text = null;
        try {
            text = Files.readAllLines(path, StandardCharsets.UTF_8);

            for (String line : text) {
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

            while(reader.ready()){
                line = reader.readLine();
                text = text.append(line);
            }
        //System.out.println(text);
        String textInFile = text.toString();
        //Pattern p = Pattern.compile(".+(\\?|!|\\.).*");
        //Matcher m = p.matcher(textInFile);
        System.out.println(textInFile);
        textInFile = textInFile.trim();  // Обрезаем усики
        System.out.println(textInFile);
        textInFile = textInFile.replaceAll("\\s{2,}", " ");  // заменяем последовательность пробелов на один пробел
        System.out.println(textInFile);
        //String[] sentences = textInFile.split("(\\?|!|\\.)");   // Разбил текст на предложения.
        //                                                        // Разбивается с потерей знаков препинания
        //textOfFile.addAll(Arrays.asList(sentences));
        //for (String sentence : textOfFile) {
        //    System.out.println(sentence);
        //}


    }

}