package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.TaskModel;
import view.TaskView;

public class TaskController {
	private ArrayList<TaskModel> tasks = new ArrayList<TaskModel>();
	TaskView taskView = new TaskView();

	public void addTask(String name, boolean check) {
		for (TaskModel t : tasks) {
			if (t.getName().equals(name)) {
				taskView.taskExist();
				return;
			}
		}
		var taskModel = new TaskModel(name, check);
		tasks.add(taskModel);
		taskView.taskAdd();
	}

	public void removeTask(String name) {
		if (verifyTask()) {
			for (TaskModel t : tasks) {
				if (t.getName().equals(name)) {
					tasks.remove(t);
					taskView.taskRemoved();
					return;
				}
			}
			taskView.taskNotFound();
		}
	}

	public void changeTask(String name, Scanner input) {
		if (verifyTask()) {
			for (TaskModel t : tasks) {
				if (t.getName().equals(name)) {
					taskView.writeCheck();
					int check = input.nextInt();
					if (check == 1) {
						t.setCheck(true);
						taskView.taskChanged();
						return;
					} else if (check == 2) {
						t.setCheck(false);
						taskView.taskChanged();
						return;
					} else {
						taskView.taskNotFound();

					}
				}
			}
		}
	}

	public void showTasks() {
		if (verifyTask()) {
			taskView.showTasks(tasks);
		}
	}

	public boolean verifyTask() {
		if (!tasks.isEmpty()) {
			return true;
		}
		taskView.noneTaskFound();
		return false;
	}
}
