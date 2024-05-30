import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		// Initialize the 'Notes' class
		Notes myNote = new Notes();

		// Initialize the Scanner method
		Scanner scan = new Scanner(System.in);

		System.out.println("\n===== Grades Tracker App =====");

		while (true) {
			System.out.println("\nSelect one of the following option");
			System.out.println("1. Add a new note");
			System.out.println("2. Delete a note");
			System.out.println("3. See all existing notes");
			System.out.println("4. Quit");

			// Ask user the menu he want to go in
			System.out.print("\nGo menu : ");
			int menuInput = scan.nextInt();

			switch (menuInput) {
				case 1:
					myNote.createNote();
					break;

				case 2:
					myNote.deleteNote();
					break;

				case 3:
					myNote.seeNotes();
					break;

				case 4:
					System.out.println("Exiting...");
					System.exit(0);
					break;

				default:
					break;
			}
		}

	}
}
