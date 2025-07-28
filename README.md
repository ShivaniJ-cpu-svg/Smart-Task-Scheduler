## Smart-Task-Scheduler
## Objective:
Smart Task Scheduler is a desktop application built using Java and JavaFX that helps users efficiently manage tasks with prioritization, filtering, reminders, and file I/O support. It's designed for productivity enthusiasts who want to stay on top of their to-do lists with an intuitive UI and intelligent task organization.

---

## ✨ Features

- ✅ Add, update, and delete tasks
- ⏰ Reminders for tasks with due dates
- 🎯 Task prioritization (High, Medium, Low)
- 🔍 Filter tasks by status, date, or priority
- 💾 Save/load tasks from file (persistent storage)
- 🖥️ Clean JavaFX user interface (FXML-based)
- 📂 Organized MVC architecture

---

## 🛠️ Tech Stack

| Layer         | Technology       |
|--------------|------------------|
| Language      | Java (JDK 17+)   |
| UI Framework  | JavaFX 17        |
| Build Tool    | Manual (or IDE)  |
| IDE Support   | IntelliJ / VS Code / Eclipse |
| Architecture  | MVC Pattern      |

---

## 📁 Project Structure
Smart-Task-Scheduler/
├── src/
│ ├── controller/ # JavaFX controllers
│ ├── model/ # Task, TaskManager classes
│ ├── util/ # File I/O utilities
│ ├── view/ # FXML UI layouts
│ └── Main.java # Entry point
├── lib/ # JavaFX SDK (excluded from Git)
├── .gitignore
├── README.md


---

## 🚀 How to Run

### 1. Install Java & JavaFX
- JDK 17+
- JavaFX SDK (download from: https://openjfx.io)

### 2. Compile the project
If using CLI:
(in terminal)
javac -cp "lib/javafx-sdk/lib/*" -d out $(find src -name "*.java")
### 3. Run the application
java -cp "out:lib/javafx-sdk/lib/*" Main

# Output
<img width="1291" height="696" alt="Image" src="https://github.com/user-attachments/assets/f9a4cbb5-c02c-4dd5-a740-78d27a1d94c9" />

<img width="1035" height="456" alt="Image" src="https://github.com/user-attachments/assets/be6d238b-d427-428c-8e84-7a3278df20e0" />
