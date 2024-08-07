package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {
	private final UserInterface ui;

	public ApplicationLogic(UserInterface ui) {
		this.ui = ui;
	}

	public void execute(int times) {
		while (times > 0) {
			System.out.println("Application logic is working");
			ui.update();
			times--;
		}
	}
}
