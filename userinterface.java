public class UserInterface {
	public void showui(Person person){
		System.out.println("Select an action:");
		System.out.println("1. Display person info");
		System.out.println("2. Edit person);
		System.out.println("9. Quit);

		String command = System.onsole().readLine();

		while(!command.equals("9")){
			if (command.equals("1"){
				person.getInfo();
			}
			if (command.equals("2"){
				System.out.print("Name: "+person.firstName+". Press 1 to keep or 2 to edit.");
			char input = System.console().readLine();
			if (input.equals("2){
				System.out.print("Enter new name:");
				person.firstName = System.console().readLine();
			}
			System.out.print("Surname: "+person.lastName+". Press 1 to keep or 2 to edit.");
                        char input = System.console().readLine();
                        if (input.equals("2){
                                System.out.print("Enter new name:");
                                person.lastName = System.console().readLine();
                        } 
			System.out.print("Age: "+person.age+". Press 1 to keep or 2 to edit.");
                        char input = System.console().readLine();
                        if (input.equals("2){
                                System.out.print("Enter new age:");
                                person.age = System.console().readLine();
                        }
			System.out.print("Gender: "+person.gender+". Press 1 to keep or 2 to edit.");
                        char input = System.console().readLine();
                        if (input.equals("2){ 
                                System.out.print("Enter new gender:");
                                person.gender = System.console().readLine();
                        }
			System.out.println("New info:");
			person.getInfo();
}
}
}
}

