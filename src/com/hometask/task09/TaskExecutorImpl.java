package com.hometask.task09;

import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

/**
 * Created by Vladislav on 14.12.2014.
 */
public class TaskExecutorImpl implements TaskExecutor {
    private TasksStorage ts;
    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        ts = tasksStorage;
    }

    @Override
    public TasksStorage getStorage() {
        return ts;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        this.start();
    }

    @Override
    public void stop() throws IllegalStateException {
        this.stop();
    }
}
