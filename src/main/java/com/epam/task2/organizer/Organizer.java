package com.epam.task2.organizer;

import com.epam.task2.parse.Parser;
import com.epam.task2.prepare.Prepare;
import com.epam.task2.readerio.Reader;
import com.epam.task2.task.Task;

import java.util.List;

/**
 * Created by Meir on 29.10.2015.
 */
public class Organizer {
    Reader reader;
    Prepare prepare;
    Parser parser;
    List<Task> tasks;

    public Organizer(Reader reader, Prepare prepare, Parser parser, List<Task> tasks){
        this.reader = reader;
        this.prepare = prepare;
        this.parser = parser;
        this.tasks = tasks;
    }



}
