package view;

import java.util.ArrayList;

import model.TaskModel;

public class TaskView {
	
	public void taskNotFound() {
		System.out.println("Tarefa n�o encontrada!");
	}
	
	public void taskRemoved() {
		System.out.println("Tarefa removida!");
	}
	
	public void noneTaskFound() {
		System.out.println("Nenhuma tarefa encontrada!");
	}
	
	public void taskChanged() {
		System.out.println("Tarefa Alterada!");
	}
	
	public void taskAdd() {
		System.out.println("Tarefa Adicionada!");
	}
	
	public void taskExist() {
		System.out.println("Tarefa J� existente!");
	}
	
	public void showTasks(ArrayList<TaskModel> tasks) {
		for (TaskModel t : tasks) {
			System.out.printf("Nome: %s\n", t.getName());
			System.out.printf("Conclus�o: %s\n", t.isCheck());
		}
	}
	
	public void writeCheck() {
		System.out.println("Tarefa concluida?\n"
				+ "(1)Concluida\n"
				+ "(2)N�o Concluida");
	}
}
