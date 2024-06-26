/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package poe.part.pkg1;

import java.util.Arrays;
import java.util.List;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

class TaskManagerTest {

    @Test
   public void testArrayPopulation() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();
        List<String> expectedDevelopers = Arrays.asList("Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer");
        Object actualDevelopers = null;
        assertEquals(expectedDevelopers, actualDevelopers);
    }

    @Test
   public void testLongestDurationTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();
        String expectedLongestDurationTask = "Glenda Oberholzer, 11 hours";
        String actualLongestDurationTask = taskManager.getLongestDurationTask();
        assertEquals(expectedLongestDurationTask,actualLongestDurationTask);
    }

    @Test
    public void testSearchTaskByName() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();

        String expectedTaskDetails = "Create Login, Mike Smith, To Do";
        String actualTaskDetails = taskManager.searchTaskByName("Create Login");
        assertEquals(expectedTaskDetails, actualTaskDetails);
    }

    @Test
   public void testSearchTasksByDeveloper() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();

        List<String> expectedTasks = Arrays.asList("Create Reports");
        List<String> actualTasks = taskManager.searchTasksByDeveloper("Samantha Paulson");
        assertEquals(expectedTasks, actualTasks);
    }

    @Test
   public void testDeleteTask() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();

        taskManager.deleteTask("Create Reports");
        List<String> expectedTasks = Arrays.asList("Create Login", "Create Add Features", "Add Arrays");
        List<String> actualTasks = taskManager.getTaskNames(); 
        assertEquals(expectedTasks, actualTasks);
    }

    @Test
   public void testDisplayReport() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTasks();

        String expectedReport = "Task Status: To Do\nDeveloper Details: Mike Smith\nTask Number: 0\nTask Name: Create Login\nTask Description: Create Login to authenticate users\nTask ID: CR:0:ITH\nTask Duration: 5 hours\n\n" +
                                "Task Status: Doing\nDeveloper Details: Edward Harrison\nTask Number: 1\nTask Name: Create Add Features\nTask Description: Create Add Task feature to add task  users\nTask ID: CR:1:SON\nTask Duration: 8 hours\n\n" +
                                "Task Status: Done\nDeveloper Details: Samantha Paulson\nTask Number: 2\nTask Name: Create Reports\nTask Description: Create Reports\nTask ID: CR:2:LSON\nTask Duration: 2 hours\n\n" +
                                "Task Status: To Do\nDeveloper Details: Glenda Oberholzer\nTask Number: 3\nTask Name: Add Arrays\nTask Description: Add Arrays\nTask ID: AD:3:ZER\nTask Duration: 11 hours\n";
        String actualReport = taskManager.displayReport();
        assertEquals(expectedReport, actualReport);
    }
}

