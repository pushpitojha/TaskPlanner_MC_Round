package Bean;
import java.util.*;
public class user {
	
	private String name;
	private List<Task> taskList;
	private String sprint;

	
	//Constructor
	public user(String name, List<Task> taskList, String sprint) {
		this.name = name;
		this.taskList = taskList;
		this.sprint = sprint;
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	public String getSprint() {
		return sprint;
	}
	public void setSprint(String sprint) {
		this.sprint = sprint;
	}
	
	//toString
	@Override
	public String toString() {
		return "User [name=" + name + ", taskList=" + taskList + ", sprint=" + sprint + "]";
	}
}
