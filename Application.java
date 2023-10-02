public class Application {
	public void run() {
		UserInterface ui = new UserInterface();
		Person user = new Person();
		ui.showUI(user);
	}
}