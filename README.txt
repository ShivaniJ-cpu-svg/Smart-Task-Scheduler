Smart Task Scheduler with Priority Queues
-----------------------------------------

Objective:
----------
A JavaFX-based desktop application that helps users manage tasks with priorities, deadlines, reminders, and filters. Tasks are auto-sorted using a PriorityQueue based on urgency.

Features:
---------
✅ Add, delete, and view tasks  
✅ Priority-based task ordering  
✅ Deadline reminders using Java Timer  
✅ Save/load tasks using JSON (Gson library)  
✅ Filters for today's tasks and high-priority tasks  
✅ JavaFX GUI with user-friendly interface  

Tools & Technologies:
---------------------
- Java 11+
- JavaFX SDK
- Gson Library (for JSON)
- IntelliJ IDEA / Eclipse (optional for editing)
- Terminal / Command Line (for compilation and running)

How to Compile (if needed):
---------------------------
1. Open terminal in project folder.
2. Run:
   javac -cp "lib/javafx-sdk/lib/*:lib/gson-2.10.1.jar" -d out $(find src -name "*.java")

How to Run Executable JAR:
--------------------------
Make sure the following files are present:
- SmartTaskScheduler.jar
- lib/javafx-sdk/ (with lib/*.jar inside)
- lib/gson-2.10.1.jar

Then run the following command in terminal:

   java -cp "SmartTaskScheduler.jar:lib/javafx-sdk/lib/*:lib/gson-2.10.1.jar" \
     --module-path lib/javafx-sdk/lib \
     --add-modules javafx.controls,javafx.fxml \
     Main

(Use `;` instead of `:` on Windows.)

Deliverables:
-------------
- ✅ Source code (in /src)
- ✅ Executable JAR file (SmartTaskScheduler.jar)
- ✅ Screenshots of the application
- ✅ README.txt (this file)



