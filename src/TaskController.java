package controller;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import model.Task;
import model.TaskManager;
import util.TaskStorage;

import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class TaskController {
    private TaskManager manager = new TaskManager();
    private ObservableList<Task> taskList = FXCollections.observableArrayList();
    private ListView<Task> listView;

    public TaskController(ListView<Task> listView) {
        this.listView = listView;
        loadTasks();
        startReminderService();
    }

    public void addTask(String title, int priority, LocalDate deadline) {
        Task task = new Task(title, priority, deadline);
        manager.addTask(task);
        taskList.add(task);
        refreshView();
        saveTasks();
    }

    public void deleteTask(Task task) {
        manager.removeTask(task);
        taskList.remove(task);
        refreshView();
        saveTasks();
    }

    public void refreshView() {
        FXCollections.sort(taskList);
        listView.setItems(taskList);
    }

    public void loadTasks() {
        taskList.addAll(TaskStorage.loadTasks());
        for (Task task : taskList) manager.addTask(task);
        refreshView();
    }

    public void saveTasks() {
        TaskStorage.saveTasks(taskList);
    }

    private void startReminderService() {
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(() -> {
                    for (Task task : taskList) {
                        if (task.getDeadline().equals(LocalDate.now())) {
                            Alert alert = new Alert(Alert.AlertType.INFORMATION);
                            alert.setTitle("Reminder");
                            alert.setHeaderText("Task Due Today!");
                            alert.setContentText(task.toString());
                            alert.showAndWait();
                        }
                    }
                });
            }
        }, 0, 60_000); // every minute
    }
}

