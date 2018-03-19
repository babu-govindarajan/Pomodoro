public class Task {

    private int taskId;
    private String  taskName;
    private String taskDescription;
    private TaskStatus taskStatus;

    public Task(int id, String name, String description) {
        taskId = id;
        taskName = name;
        taskDescription = description;
        taskStatus = TaskStatus.Created;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
