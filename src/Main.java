import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        int taskCount = taskManager.TaskCount();

        if(taskCount <= 0) {
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

                System.out.println("Done Adding Task? Yes/No ");
                Scanner done = new Scanner(System.in);
                String taskDone = desc.nextLine();

                if(taskDone.startsWith("Y"))
                    break;
            }
        }

        if(taskManager.TaskCount() > 0){

            List<Task> tasks = taskManager.ListAllNonCompleteTasks();

            for(Task t : tasks) {
                System.out.println(t.getTaskId() + " " + t.getTaskName());
            }

            System.out.println("Enter Task Id to work on:");
            Scanner input = new Scanner(System.in);
            int taskId = input.nextInt();

            taskManager.setCurrentTask(taskId);
            taskManager.setCurrentTaskStatus(TaskStatus.Progress);

            //Start Pomodoro timer

            //Display the remaining time

            //Once the Pomodoro timer is done, alert the user

            //Ask user whether the task is done?
            //If so update the task as complete
            //Else keep the Task status in progress

            //Display the break time - 5 minutes

        }

    }


}






