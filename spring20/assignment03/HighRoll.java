public class HighRoll {



	public static void main (String[] args) {

		int count = 0;
		int sides = 0;


		if (args.length < 2 || args.length > 2) {
			//message to user
			//exit program
			//default settings
		}

		try {
			count = Integer.parseInt(args[0]);
			sides = Integer.parseInt(args[1]);
		} catch (NumberFormatException nfe) {
			//what to do if we catch this exception
		}

		while(true) {

			//message to the user, explaining the program
			// print the menu
			//wait for input
			// execute based on user input


		}
	}
}