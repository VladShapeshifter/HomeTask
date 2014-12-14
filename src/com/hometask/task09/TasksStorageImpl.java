package com.hometask.task09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladislav on 14.12.2014.
 */
public class TasksStorageImpl implements TasksStorage {
    LinkedList<Task> taskList = new LinkedList<>();
    @Override
    public void add(Task task) throws NullPointerException {
        taskList.add(task);
    }

    @Override
    public Task get() {
        return taskList.getLast();
    }

    @Override
    public int count() {
        return taskList.size();
    }
}
