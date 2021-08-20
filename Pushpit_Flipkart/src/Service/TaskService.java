
package Service;

import java.util.*;

import Bean.Task;
import Bean.user;
import Repo.TaskRepository;
import Repo.UserRepository;

public class TaskService {
	
	public String createTask(Task task, TaskRepository taskRepository, UserRepository userRepository)
	{
		taskRepository.addTask(task);
		for(user temp: userRepository.getUserList())
		{
			if(temp.getName().equals(task.getAssignee()))
			{
				List<Task> taskList = temp.getTaskList();
				taskList.add(task);
				temp.setTaskList(taskList);
				return "Task has been added sucessfully";
			}
		}
		String name = task.getAssignee();
		List<Task> taskList = new LinkedList<Task>();
		taskList.add(task);
		String sprint = "";
		user user = new user(name,taskList,sprint);
		userRepository.addUser(user);
		return "Task has been added sucessfully";
		
	}
	
	public String changeStatus(String title, String newStatus, TaskRepository taskRepository)
	{
		  for(Task task: taskRepository.getTaskList())
		  {
			  if(task.getTitle().equals(title))
			  {
				  task.setStatus(newStatus);
				  return "Status has been updated";
			  }
		  }
		  return null;
	}

	public String changeAssignee(String title, String newAssignee, TaskRepository taskRepository,UserRepository userRepository) {
		for(Task task: taskRepository.getTaskList())
		  {
			  if(task.getTitle().equals(title))
			  {
				  task.setAssignee(newAssignee);
				  for(user user : userRepository.getUserList())
				  {
					  if(user.getName().equals(newAssignee))
					  {
						  List<Task> taskList = user.getTaskList();
						  taskList.add(task);
					  }
				  }
				  return "Assignee has been updated";
			  }
		  }
		  return null;
	}
}
