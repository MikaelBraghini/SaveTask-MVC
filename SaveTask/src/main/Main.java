package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.TaskController;

public class Main {
	
	public static void showMenu() {
		System.out.println("1- Adicionar");
		System.out.println("2- remover");
		System.out.println("3- Alterar");
		System.out.println("4- Listar");
		System.out.println("0- Adicionar");
		System.out.print("Escolha um opção: ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TaskController taskController = new TaskController();
		int menu;

		while (true) {
			try {
				showMenu();
				menu = input.nextInt();
				if (menu == 0) {
					System.out.println("Encerrando...");
					input.close();
					break;
				}
				input.nextLine();
				switch (menu) {
				case 1 -> {
					System.out.print("Digite o nome da tarefa: ");
					taskController.addTask(input.nextLine(), false);
				}
				case 2 -> {
					System.out.print("Digite o nome da tarefa que voce quer remover: ");
					taskController.removeTask(input.nextLine());
				}
				case 3 -> {
					System.out.print("Digite o nome da tarefa que voce quer alterar: ");
					taskController.changeTask(input.nextLine(), input);
				}
				case 4 -> {
					taskController.showTasks();
				}
				default -> {
					System.out.println("Digite uma opção Valida!");
				}
				}
			} catch (InputMismatchException e) {
				input.nextLine();
			}
		}
	}
}
