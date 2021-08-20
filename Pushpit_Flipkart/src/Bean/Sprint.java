package Bean;
import java.util.*;

public class Sprint {
	private String sprintTitle;
	private List<Task> taskList;

	//constructor
	public Sprint() {
	}
	
	//constructor
	public Sprint(String sprintTitle, List<Task> taskList) {
		this.sprintTitle = sprintTitle;
		this.taskList = taskList;
	}
	//getters and setters
	public String getSprintTitle() {
		return sprintTitle;
	}
	public void setSprintTitle(String sprintTitle) {
		this.sprintTitle = sprintTitle;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> task) {
		this.taskList = task;
	}

	//toString
	@Override
	public String toString() {
		return "Sprint [sprintTitle=" + sprintTitle + ", taskList=" + taskList + "]";
	}

}
