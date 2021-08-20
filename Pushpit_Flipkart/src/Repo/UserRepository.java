package Repo;

import java.util.*;

import Bean.user;

public class UserRepository {
	
	//List to store User - (UserList)
	// Optimize this with map
	private List<user> userList;
	
	//Constructor
	public UserRepository()
	{
		userList = new LinkedList<user>();
	}

	//Getter and Setter
	public List<user> getUserList() {
		return userList;
	}
	public void setUserList(List<user> userList) {
		this.userList = userList;
	}
	
	////Add users in the userList - List
	public void addUser(user user)
	{
		userList.add(user);
	}
	
	//To check a user with given name is present or not
	public user getUser(String name)
	{
		for(user temp : userList)
		{
			if(temp.getName().equals(name))return temp;
		}
		return null;
	}
}
