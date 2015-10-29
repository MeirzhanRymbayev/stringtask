package com.epam.task2.parse;

import com.epam.task2.elem.Text;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public interface Parser {
    public Text parse(List<String> sPreparedToParse);
}
