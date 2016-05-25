package BlueTurtle.TSE;

import java.io.IOException;

/**
 * Temporary main class to run the commands.
 * 
 * @author BlueTurtle.
 *
 */
public class Main {

	/**
	 * All the modes (programming languages).
	 * 
	 * @author BlueTurtle.
	 *
	 */
	enum mode {
		JAVA
	}

	static Controller controller;
	static mode currentMode = mode.JAVA;

	/**
	 * Main method.
	 * 
	 * @param args
	 *            the arguments.
	 * @throws IOException
	 *             throws an exception if a problem is encountered during the
	 *             execution of the controller.
	 */
	public static void main(String[] args) throws IOException {
		switch (currentMode) {
		case JAVA:
			controller = new JavaController();
			break;
		default:
			break;
		}
		controller.execute();
		System.out.println("Done.");
	}
}
