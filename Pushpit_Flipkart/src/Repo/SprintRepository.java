package Repo;

import java.util.*;

import Bean.Sprint;

public class SprintRepository {
	//List to store Sprints
	// Optimize this with map
	private List<Sprint> sprintList;

	//Constructor
	public SprintRepository()
	{
		sprintList = new LinkedList<Sprint>();
	}
	
	//Setter and Getter
	public List<Sprint> getSprintList() {
		return sprintList;
	}
	public void setSprintList(List<Sprint> sprintList) {
		this.sprintList = sprintList;
	}
	
	//toString
	@Override
	public String toString() {
		return "SprintRepository [sprintList=" + sprintList + "]";
	}
}
