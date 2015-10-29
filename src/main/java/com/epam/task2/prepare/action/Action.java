package com.epam.task2.prepare.action;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public interface Action {
    public List<String> doAction(List<String> linesToAction);
}
