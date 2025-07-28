package model;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private String title;
    private int priority;
    private LocalDate deadline;

    public Task(String title, int priority, LocalDate deadline) {
        this.title = title;
        this.priority = priority;
        this.deadline = deadline;
    }

    public String getTitle() { return title; }
    public int getPriority() { return priority; }
    public LocalDate getDeadline() { return deadline; }

    public void setTitle(String title) { this.title = title; }
    public void setPriority(int priority) { this.priority = priority; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return title + " (Priority: " + priority + ", Due: " + deadline + ")";
    }
}

