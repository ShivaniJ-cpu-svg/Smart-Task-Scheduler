package view;

import controller.TaskController;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import model.Task;

import java.time.LocalDate;

public class TaskView {
    public void start(Stage stage) {
        ListView<Task> taskListView = new ListView<>();
        TaskController controller = new TaskController(taskListView);

        TextField titleInput = new TextField();
        titleInput.setPromptText("Task Title");

        Spinner<Integer> priorityInput = new Spinner<>(1, 10, 5);
        DatePicker datePicker = new DatePicker(LocalDate.now());

        Button addBtn = new Button("Add Task");
        addBtn.setOnAction(e -> {
            String title = titleInput.getText();
            int priority = priorityInput.getValue();
            LocalDate deadline = datePicker.getValue();
            if (!title.isEmpty()) {
                controller.addTask(title, priority, deadline);
                titleInput.clear();
            }
        });

        Button deleteBtn = new Button("Delete Selected");
        deleteBtn.setOnAction(e -> {
            Task selected = taskListView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                controller.deleteTask(selected);
            }
        });

        HBox inputBox = new HBox(10, titleInput, priorityInput, datePicker, addBtn, deleteBtn);
        VBox root = new VBox(10, taskListView, inputBox);
        root.setPadding(new Insets(10));

        stage.setScene(new Scene(root, 700, 400));
        stage.setTitle("Smart Task Scheduler");
        stage.show();
    }
}

