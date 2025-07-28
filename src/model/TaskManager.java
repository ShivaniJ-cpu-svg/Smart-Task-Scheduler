package model;

import java.util.PriorityQueue;

public class TaskManager {
    private PriorityQueue<Task> taskQueue;

    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }

    public void addTask(Task task) {
        taskQueue.offer(task);
    }

    public void removeTask(Task task) {
        taskQueue.remove(task);
    }

    public PriorityQueue<Task> getAllTasks() {
        return new PriorityQueue<>(taskQueue);
    }

    public void clearTasks() {
        taskQueue.clear();
    }
}

