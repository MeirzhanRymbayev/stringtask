package com.epam.task2.prepare;

import com.epam.task2.prepare.action.Action;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public interface Prepare {
    public List<String> preparer(List<String> linesToPrepare, List<Action> actionsWithLines);
}
