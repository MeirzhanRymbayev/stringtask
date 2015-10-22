package com.epam.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Meir on 22.10.2015.
 */
public class WorkWithText {

    private List<Word> sentence = new LinkedList<Word>();
    Text texT = new Text(new LinkedList<Sentence>());



    /**
     *  Text will be prepared for work when this method will be called.
     *  Text will be trimmed and all space sequences will be replaced by one
     * @param text text which will be prepared to work
     * @return return prepared text
     */
    private String prepareText(String text) {
        text = text.trim();  // �������� �����
        text = text.replaceAll("\\s{2,}", " ");
        return text;
    }

    protected List<Word> workText(String text) {
        text = prepareText(text);
        String[] sentences = text.split("(\\?|!|\\.)");         // ������ ����� �� �����������.
        // ����������� � ������� ������ ����������
        for (int i = 0; i < sentences.length; i++) {      //�������� �� ������������
            String[] words = sentences[i].split(" ");   // ��������� ����������� �� �����

            for (int j = 0; j < words.length; j++) {      //�������� �� ������
                String word = words[j];
                sentence.add(new Word(word));           //� ����� ��������� ���� �����������
            }
            texT.text.add(new Sentence(sentence));      // ����� ����� �� �����������

        }
        return sentence;
    }
}
