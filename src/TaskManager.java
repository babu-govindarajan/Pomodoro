import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List<Task> tasks;
    List<Task> nonCompleteTasks;
    Task currentTask;

    public TaskManager()
    {
        tasks = new ArrayList<>();
        nonCompleteTasks = new ArrayList<>();
    }

    public void AddTask(String taskName, String taskDescription) {
        int taskId = tasks.size();
        Task task = new Task(taskId, taskName, taskDescription);

        tasks.add(task);
    }

    public void AddTask(Task task) {
        tasks.add(task);
    }

    public int TaskCount() {
        if(ListAllNonCompleteTasks() != null)
            return ListAllNonCompleteTasks().size();
        else
            return 0;

    }

    public int AllTasksCount() {
        return tasks.size();
    }

    public List<Task> ListAllNonCompleteTasks() {

        List<Task> nonCompleteTasks = new ArrayList<Task>();

        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).getTaskStatus() != TaskStatus.Completed)
                nonCompleteTasks.add(tasks.get(i));
        }

        return nonCompleteTasks.size() > 0 ? nonCompleteTasks : null;
    }

    public void setCurrentTask(int taskId) {
        Task currentTask = tasks.get(taskId - 1);

        this.currentTask = currentTask;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTaskStatus(TaskStatus taskStatus) {
        currentTask.setTaskStatus(taskStatus);
    }

    public TaskStatus getCurrentTaskStatus() {
        return currentTask.getTaskStatus();
    }
}
