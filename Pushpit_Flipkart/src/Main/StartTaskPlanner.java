package Main;

import java.util.*;

import Bean.Sprint;
import Bean.Task;
import Repo.SprintRepository;
import Repo.TaskRepository;
import Repo.UserRepository;
import Service.SprintService;
import Service.TaskService;
import Service.UserService;

public class StartTaskPlanner {
	
	public static void main(String[] args) {
		
		
		TaskRepository taskRepository = new TaskRepository();
		UserRepository userRepository = new UserRepository();
		TaskService taskService = new TaskService();
		
		Task task1 = new Task("Create Dash","Brad", "Peter" ,"open","feature","2019-04-12");
		taskService.createTask(task1,taskRepository,userRepository);
		Task task2 = new Task("title1","creater2", "Assignee3" ,"status4","type5","duedate6");
		taskService.createTask(task2,taskRepository,userRepository);
		
		
//		System.out.println(taskRepository.getTaskList());
//		System.out.println(taskService.changeStatus("title1", "updatedstatus", taskRepository));
//        System.out.println(taskRepository.getTaskList());
        System.out.println(taskService.changeAssignee("title1", "Peter", taskRepository, userRepository));
//        System.out.println(taskRepository.getTaskList());
        
        UserService userService = new UserService();
        System.out.println(userService.displayUserStatus("Peter",userRepository));
        System.out.println(userService.displayUserStatus("Assignee3",userRepository));
        
        List<Task> taskList = new LinkedList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        
        SprintRepository sprintRepository = new SprintRepository();
        SprintService sprintService = new SprintService();
        
        Sprint sprint1 = new Sprint("Sprint-1",taskList);
        System.out.println(sprintService.createSprint(sprint1, sprintRepository));
        System.out.println(sprintService.displaySprint("Sprint-1", sprintRepository));
        

        Task task3 = new Task("title100","creater200", "Assignee300" ,"status400","type500","duedate700");
		taskService.createTask(task3,taskRepository,userRepository);
		
		System.out.println(sprintService.addTaskToSprint(task3, "Sprint-2", sprintRepository));
		System.out.println(sprintRepository);
		System.out.println(sprintService.deleteTaskFromoSprint("title100", "Sprint-1", sprintRepository));
		System.out.println(sprintRepository);
		
		Sprint sprint2 = new Sprint("Sprint-2",taskList);
        System.out.println(sprintService.createSprint(sprint2, sprintRepository));
        System.out.println(sprintService.displaySprint("Sprint-2", sprintRepository));
        System.out.println(sprintRepository);
        System.out.println(sprintService.deleteSprint("Sprint-2", sprintRepository));
        System.out.println(sprintRepository);
	}

}
