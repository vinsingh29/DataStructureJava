package singleLinkedList;

import java.util.Scanner;

public class SingleLinkedListClient {

	public static void main(String[] args) {

		System.out.println("Creating a Linked List... ");
		System.out.println("Enter Number of Node in Linked List ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int numberOfNode = input.nextInt();
		SingleLinkedList L1 = new SingleLinkedList();
		L1.create(numberOfNode);
		L1.display();

		while (true) {
			System.out.println("Menu as Follows");
			System.out.println("1: Insert at Begining" + '\n' + "2: Insert at End" + '\n' + "3: Delete at begin" + '\n'
					+ "4: Delete at End" + '\n' + "5: Display" + '\n' + "8: Exit");
			int option = input.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter data to be inserted at Begin  ");
				int begin = input.nextInt();
				L1.insertBegin(begin);
				L1.display();
				break;
			case 2:
				System.out.println("Enter data to be inserted at End  ");
				int end = input.nextInt();
				L1.insertEnd(end);
				L1.display();
				break;
			case 3:

				L1.deleteBegin();
				L1.display();
				break;
			case 4:

				L1.deleteEnd();
				L1.display();
				break;
			case 5:

				L1.display();
				break;

			case 8:
				;

			}
			if (option == 8)
				break;
		}

	}

}
