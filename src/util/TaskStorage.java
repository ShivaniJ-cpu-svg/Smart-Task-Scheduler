package util;

import com.google.gson.reflect.TypeToken;
import com.google.gson.*;
import model.Task;

import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;

public class TaskStorage {
    private static final String FILE_NAME = "tasks.json";
    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(LocalDate.class, (JsonDeserializer<LocalDate>)
                    (json, type, context) -> LocalDate.parse(json.getAsString()))
            .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>)
                    (src, type, context) -> new JsonPrimitive(src.toString()))
            .setPrettyPrinting()
            .create();

    public static void saveTasks(List<Task> tasks) {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(tasks, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Task> loadTasks() {
        try (Reader reader = new FileReader(FILE_NAME)) {
            Type taskListType = new TypeToken<List<Task>>() {}.getType();
            return gson.fromJson(reader, taskListType);
        } catch (IOException e) {
            return new java.util.ArrayList<>();
        }
    }
}

