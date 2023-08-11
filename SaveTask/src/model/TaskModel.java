package model;

public class TaskModel {
	private String name;
	private boolean check;

	public TaskModel(String name, boolean check) {
		this.name = name;
		this.check = check;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
}
