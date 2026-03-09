import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String name;
    boolean completed;

    Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String toString() {
        if (completed) {
            return name + " ✔";
        } else {
            return name + " ✘";
        }
    }
}

public class TodoApp {

    // ── Helper 1: print all tasks ──────────────────────────────
    static void printTasks(ArrayList<Task> tasks) {
        tasks.stream().forEach(t -> System.out.println(t));
    }

    // ── Helper 2: safely read a number ────────────────────────
    static int readNumber(Scanner sc) {
        try {
            int num = sc.nextInt();
            sc.nextLine();
            return num;
        } catch (Exception e) {
            sc.nextLine();
            return -1;
        }
    }

    static void saveTasks(ArrayList<Task> tasks) {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("tasks.txt"))) {
        for (Task t : tasks) {
            bw.write(t.name + "|" + t.completed);
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("⚠ Could not save: " + e.getMessage());
    }
}

    // ── Main ───────────────────────────────────────────────────
    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==== TO DO LIST ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Mark Task Complete");
            System.out.println("5. Mark Task Incomplete");
            System.out.println("6. Edit Task");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            // ✅ using readNumber helper instead of repeating try-catch
            int choice = readNumber(sc);
            if (choice == -1) {
                System.out.println("⚠ Please enter a number!");
                continue;
            }

            if (choice == 1) {
                System.out.print("Enter task: ");
                String taskName = sc.nextLine().trim();
                if (taskName.isEmpty()) {
                    System.out.println("⚠ Task name cannot be empty!");
                } else {
                    tasks.add(new Task(taskName));
                    System.out.println("✅ Task added!");
                }
            }

            else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet!");
                } else {
                    System.out.println("\n--- YOUR TASKS ---");
                    printTasks(tasks); // ✅ using printTasks helper
                    System.out.println("------------------");

                    long done = tasks.stream().filter(t -> t.completed).count();
                    System.out.println("✔ " + done + " done / " + (tasks.size() - done) + " remaining");

                    System.out.println("\n✔ Completed:");
                    tasks.stream()
                         .filter(t -> t.completed)
                         .forEach(System.out::println);
                }
            }

            else if (choice == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to delete!");
                } else {
                    System.out.print("Enter task number to delete: ");
                    int num = readNumber(sc); // ✅ helper replaces try-catch
                    if (num == -1) { System.out.println("⚠ Please enter a number!"); continue; }
                    if (num > 0 && num <= tasks.size()) {
                        String deleted = tasks.get(num - 1).name;
                        tasks.remove(num - 1);
                        System.out.println("🗑 \"" + deleted + "\" deleted!");
                    } else {
                        System.out.println("⚠ Invalid task number!");
                    }
                }
            }

            else if (choice == 4) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available!");
                } else {
                    System.out.print("Enter task number to mark complete: ");
                    int num = readNumber(sc); // ✅ helper replaces try-catch
                    if (num == -1) { System.out.println("⚠ Please enter a number!"); continue; }
                    if (num > 0 && num <= tasks.size()) {
                        tasks.get(num - 1).completed = true;
                        System.out.println("🎉 \"" + tasks.get(num - 1).name + "\" marked complete!");
                    } else {
                        System.out.println("⚠ Invalid task number!");
                    }
                }
            }

            else if (choice == 5) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks available!");
                } else {
                    System.out.print("Enter task number to mark incomplete: ");
                    int num = readNumber(sc); // ✅ helper replaces try-catch
                    if (num == -1) { System.out.println("⚠ Please enter a number!"); continue; }
                    if (num > 0 && num <= tasks.size()) {
                        tasks.get(num - 1).completed = false;
                        System.out.println("↩ \"" + tasks.get(num - 1).name + "\" marked incomplete!");
                    } else {
                        System.out.println("⚠ Invalid task number!");
                    }
                }
            }

            else if (choice == 6) {
                if (tasks.isEmpty()) {
                    System.out.println("No tasks to edit!");
                } else {
                    System.out.print("Enter task number to edit: ");
                    int num = readNumber(sc); // ✅ helper replaces try-catch
                    if (num == -1) { System.out.println("⚠ Please enter a number!"); continue; }
                    if (num > 0 && num <= tasks.size()) {
                        System.out.print("Enter new task name: ");
                        String newName = sc.nextLine().trim();
                        if (newName.isEmpty()) {
                            System.out.println("⚠ Task name cannot be empty!");
                        } else {
                            String old = tasks.get(num - 1).name;
                            tasks.get(num - 1).name = newName;
                            System.out.println("✏ \"" + old + "\" → \"" + newName + "\"");
                        }
                    } else {
                        System.out.println("⚠ Invalid task number!");
                    }
                }
            }

            else if (choice == 7) {
                System.out.println("👋 Goodbye!");
                break;
            }

            else {
                System.out.println("⚠ Invalid option! Choose 1-7.");
            }
        }

        sc.close();
    }
}