package com.epam.task2.prepare.action;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public class ReplaceTabsToSpace implements Action {

    public List<String> doAction(List<String> linesToAction) {
        for(String s : linesToAction) {
            s = s.replaceAll("\\t{2,}", " ");
        }
        return linesToAction;
    }
}
