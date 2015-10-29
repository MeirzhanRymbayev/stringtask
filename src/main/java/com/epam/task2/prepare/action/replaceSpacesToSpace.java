package com.epam.task2.prepare.action;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public class ReplaceSpacesToSpace implements Action{

    public List<String> doAction(List<String> lines){
        for(String s: lines){
            s = s.replaceAll("\\s{2,}", " ");
        }
        return lines;
    }
}
