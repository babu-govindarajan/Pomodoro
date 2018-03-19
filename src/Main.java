import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        int taskCount = taskManager.TaskCount();

        if(taskCount > 0) {
            List<Task> tasks = taskManager.ListAllNonCompleteTasks();

            for(Task t : tasks) {
                System.out.println(t.getTaskId() + " " + t.getTaskName());
            }
        } else {
            System.out.println("Add Task(s) to the list");

            while(true) {

                System.out.println("Enter Task Name: ");
                Scanner input = new Scanner(System.in);
                String name = input.nextLine();

                System.out.println("Enter Task Description: ");
                Scanner desc = new Scanner(System.in);
                String taskDesc = desc.nextLine();

                Task task = new Task(taskManager.AllTasksCount(), name, taskDesc);
                taskManager.AddTask(task);
            }
        }

        //If the Task list is Empty create Task

            //Each Task should have estimate of number of Pomodoro time takes to finish a Task
        //Give option to insert new Tasks or work on existing Tasks

        //Choose a Task from the list

        //Start Pomodoro timer

        //Set the selected Task status in Progress

        //Display the remaining time

        //Once the Pomodoro timer is done, alert the user

        //Ask user whether the task is done?
            //If so update the task as complete
            //Else keep the Task status in progress

        //Display the break time - 5 minutes

        //
    }


}






