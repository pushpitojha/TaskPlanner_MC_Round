package Bean;

public class Task {
	private String title;
	private String creater;
	private String assignee;
	private String status;
	private String dueDate;
	private String type;
	//private String sprint;
	
	//Constructors
	public Task(String title, String creater, String assignee, String status, String dueDate, String type) {
		this.title = title;
		this.creater = creater;
		this.assignee = assignee;
		this.status = status;
		this.dueDate = dueDate;
		this.type = type;
		//this.sprint = sprint;
	}

	//Getter and Setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//toString
	@Override
	public String toString() {
		return "Task [creater=" + creater + ", assignee=" + assignee + ", status=" + status + ", type=" + type
				+ ", dueDate=" + dueDate + ", title=" + title + "]";
	}
	
	
}
