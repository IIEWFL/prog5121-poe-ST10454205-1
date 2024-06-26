//Code uses references from tutorials point
//https://www.tutorialspoint.com/how-can-we-create-a-login-form-in-java
//She Codes used to understand some systems however was not used in actual code 
//https://www.shecodes.io/athena/39971-how-to-create-login-and-registration-code-in-java 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part.pkg1;
/**
 *
 * @author lab_services_student
 */
import java.util.ArrayList;
import java.util.List;
 import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Account {
    public static void main(String[] args) {
      //Code adapted from JAVA Guids
      //https://www.javaguides.net/2020/03/java-scanner-tutorial-reading-login-and-registration-user-input.html
        
        // Records username 
        try (Scanner scanner = new Scanner(System.in)) {
            String username;
             {
                System.out.print("Enter username. The username must contain an underscore and be no more than 5 characters long: ");
                username = scanner.nextLine();
            } if true (Username(username));
                    System.out.print("Username successfully captured");
              else false System.out.print("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 charecters in length");
            
        // Records password    
            String password;
             {
                System.out.print("Enter password. Password must be at least 8 characters long, contain a capital letter, a number, and a special character: ");
                password = scanner.nextLine();
            } if true (Password(password));
                     System.out.print("Password captured successfully");
              else false System.out.print("Password is not correctly formatted, please ensure that the password contains at least 8 charachters, a capital letter, a number and a special character");
        // Records First name    
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
        //Records last name    
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
        // Confirmation of information entered    
            System.out.println("Your account has been successfully created");
        }
    }
    //used to validate username conditions
    public static boolean Username(String username) {
        return username.length() <= 5 && username.contains("_");
    }
    //used to validate password conditions
    public static boolean Password(String password) {
        String pattern = "(?=.*[0-9])(?=.*[A to Z])(?=.*[!@#$%^&*()_+\\-=\\";
        return password.matches(pattern);
    }
}
// initiate strings for upcomming inputs and tasks
class Task {

    static String returnTotalHours() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskStatus;

    Task(String taskName, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String createTaskID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean printTaskDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

public class Kanban {
    private final List<Task> tasks;
    private final Scanner scanner;
    private final Login login;

    public Kanban() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
        login = new Login();
    }

    public static void start() {
        System.out.println("Welcome to Kanban");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        String registration = login.registerUser(username, password, firstName, lastName);
        System.out.println(registration);

        if (registration.equals("User registered successfully")) {
            return;
        }
// input previous login details
        System.out.print("Enter username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String loginPassword = scanner.nextLine();

        boolean loginSuccessful = login.loginUser(loginUsername, loginPassword);
        System.out.println(login.returnLoginStatus(loginSuccessful));

        if (loginSuccessful) {
            return;
            else print ("invalid")    
        }
// implement code to select task related choice
        int option = 0;
        while (option = 3) {
            System.out.println("1) Add tasks 2) Show report 3) Quit");
            option = scanner.nextInt();
            scanner.nextLine();
//determine task status
//https://www.w3schools.com/java/java_switch.asp used to assist in creation of switch statement
            switch (option) {
                case 1:
                    addTasks();
                    break;
                case 2:
                    System.out.println("Coming Soon");
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private void addTasks() {
        System.out.print("How many tasks do you want to add? ");
        int numberOfTasks = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfTasks; i++) {
            System.out.print("Enter the task's name: ");
            System.out.print("Enter the task's description: ");
            String taskDescription = scanner.nextLine();
            if (taskDescription.length() > 50) {
                System.out.println("Please enter a decription of the task, must be under 50 charachters");
                i--;
                continue;
            }
            System.out.println("Task successfully captured");

            System.out.print("Enter the developer's details: ");
            String developerDetails = scanner.nextLine();
            System.out.print("Enter the duratio of the task: ");
            int taskDuration = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Select task status:1) To Do 2) Done 3) Doing");
            int statusOption = scanner.nextInt();
            scanner.nextLine();
            String taskStatus;
//https://www.w3schools.com/java/java_switch.asp used to assist in creation of switch statement            
            switch (statusOption) {
                case 1: 
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid option");
            }

    /**
     *
     */
    public class TaskManager {
        
    }
    //This method was adapted from io.com
    //https://ioflood.com/blog/java-initialize-arraylist/#:~:text=The%20simplest%20way%20to%20initialize,initialize%20an%20ArrayList%20in%20Java.
    //Gabriel Ramuglia
    //https://ioflood.com/blog/author/gabriel-ramuglia/
   
    private final List<String> developers = new ArrayList<>();
    private final List<String> taskNames = new ArrayList<>();
    private final List<String> taskIDs = new ArrayList<>();
    private final List<Integer> taskDurations = new ArrayList<>();
    private final List<String> taskStatuses = new ArrayList<>();

    // add tasks
    public void addTasks() {
        System.out.println("Welcome to EasyKanban");
        System.out.print("Enter the number of tasks to add: ");
        int numTasks = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numTasks; i++) {
            System.out.print("Enter task name: ");
            String taskName = scanner.nextLine();
            System.out.print("Enter a task description of 50 or less charachters: ");
            String taskDescription = scanner.nextLine();
             while (taskDescription.length() >= 50) {
                taskDescription = scanner.nextLine();
            }

            System.out.print("Enter the developer's details (first and last name): ");
            String developerDetails = scanner.nextLine();

            System.out.print("Enter the task's duration: ");
            int taskDuration = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the task's status (To Do / Done / Doing): ");
            String taskStatus = scanner.nextLine();

            Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, taskStatus);
            tasks.add(task);
//This method was created using Stackoverflow
//https://stackoverflow.com/questions/7935613/adding-to-an-arraylist-java
//Aravind A
//https://stackoverflow.com/users/10568033/aravind-a

            // Add task details to the arrays
            developers.add(developerDetails);
            taskNames.add(taskName);
            taskIDs.add(task.createTaskID());
            taskDurations.add(taskDuration);
            taskStatuses.add(taskStatus);

            System.out.println(task.printTaskDetails());
            System.out.println("Task has been successfully captured");
        }

        System.out.println("Total task duration: " + Task.returnTotalHours() + " hours");
    }

    //display reports
    public void displayReports() {
        for (int i = 0; i < tasks.size(); i++) {
            if (taskStatuses.get(i).equalsIgnoreCase("Done")) {
                System.out.println("Developer: " + developers.get(i) + ", Task Name: " + taskNames.get(i) + ", Task Duration: " + taskDurations.get(i) + " hours");
            }
        }

        System.out.println("Display the Developer and the task with the longest duration");
        int maxDurationIndex = 0;
        for (int i = 1; i < taskDurations.size(); i++) {
            if (taskDurations.get(i) > taskDurations.get(maxDurationIndex)) {
                maxDurationIndex = i;
            }
        }
        System.out.println("Developer: " + developers.get(maxDurationIndex) + ", Task Duration: " + taskDurations.get(maxDurationIndex) + " hours");

        System.out.print("Enter the task name to search: ");
        String searchTaskName = scanner.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(searchTaskName)) {
                System.out.println("Task Name: " + taskNames.get(i) + ", Developer: " + developers.get(i) + ", Task Status: " + taskStatuses.get(i));
                break;
            }
        }

        System.out.print("Enter the developer's name to search for: ");
        String searchDeveloper = scanner.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(searchDeveloper)) {
                System.out.println("Task Name: " + taskNames.get(i) + ", Task Status: " + taskStatuses.get(i));
            }
        }
        System.out.print("Enter the task name to delete: ");
        String deleteTaskName = scanner.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
             if (taskNames.get(i).equalsIgnoreCase(deleteTaskName)) {
                tasks.remove(i);
                 String remove = developers.remove(i);
                 String remove1 = taskNames.remove(i);
                 String remove2 = taskIDs.remove(i);
                 Integer remove3 = taskDurations.remove(i);
                taskStatuses.remove(i);
                System.out.println("Task '" + deleteTaskName + "deleted");
            }
        }
        for (Task task : tasks) {
            System.out.println(task.printTaskDetails());
        }
    }