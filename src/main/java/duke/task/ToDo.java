package duke.task;

public class ToDo extends Task {

    public ToDo(String description) {
        super(description);
    }

    public ToDo(String description, boolean isDone) {
        super(description, isDone);
    }


    @Override
    public String printTask() {
        return "[T]" + super.printTask();
    }
}
