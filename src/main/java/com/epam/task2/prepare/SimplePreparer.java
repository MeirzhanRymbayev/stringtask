package com.epam.task2.prepare;

import com.epam.task2.prepare.action.Action;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public class SimplePreparer implements Prepare {

    public List<String> preparer(List<String> linesToPrepare, List<Action> actionsWithLines) {
        for(Action action : actionsWithLines){
            linesToPrepare = action.doAction(linesToPrepare);
        }
        return linesToPrepare;
    }
}
