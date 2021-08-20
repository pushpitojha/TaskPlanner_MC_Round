package Repo;

import java.util.*;

import Bean.Task;

public class TaskRepository {
	
	//List to store Tasks
	// Optimize this with map
	private List<Task> taskList;
	
	//Constructor
    public TaskRepository()
    {
    	taskList = new LinkedList<Task>();
    }
    
    //Getter and Setter
	public List<Task> getTaskList() {
		return taskList;
	}
	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}
	
	//Add tasks in the taskList - List
	public void addTask(Task task)
	{
		taskList.add(task);
	}
	
	//To check a task with given title is present or not
	public Task getTask(String title)
	{
		for(Task temp : taskList)
		{
			if(temp.getTitle().equals(title))return temp;
		}
		return null;
		
	}
}
