public class UserInterface {
	public void showUI(Person person) {
		System.out.println("Select an action:");
		System.out.println("1. Display person info");
		System.out.println("2. Edit person");
		System.out.println("9. Quit");
		System.out.println();

		String command;
		do {
			command = System.console().readLine();

			switch (command) {
				case "1":
					person.getInfo();
					break;
				case "2":
					System.out.print("Name: " + person.firstName + ". Press 1 to keep or 2 to edit.");
					String input = System.console().readLine();
					if (input.equals("2")) {
						System.out.print("Enter new name: ");
						person.firstName = System.console().readLine();
					}

					System.out.print("Surname: " + person.lastName + ". Press 1 to keep or 2 to edit.");
					String input2 = System.console().readLine();
					if (input2.equals("2")) {
						System.out.print("Enter new surname: ");
						person.lastName = System.console().readLine();
					}

					System.out.print("Age: " + person.age + ". Press 1 to keep or 2 to edit.");
					String input3 = System.console().readLine();
					if (input3.equals("2")) {
						System.out.print("Enter new age: ");
						person.age = Integer.parseInt(System.console().readLine());
					}

					System.out.println("Gender: " + person.gender + ". Press 1 to keep or 2 to edit.");
					String input4 = System.console().readLine();
					if (input4.equals("2")) {
						System.out.println("Enter new gender: ");
						person.gender = System.console().readLine();
					}

					System.out.println("New info:");
					person.getInfo();
					break;
				case "9":
					break;
				default:
					System.out.println("Invalid command. Please select 1, 2, or 9.");
					break;
			}
		} while (!command.equals("9"));
	}
}