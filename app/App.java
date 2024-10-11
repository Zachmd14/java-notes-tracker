import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
	public static void main(String[] args) {

		// Initialize the 'Notes' class
		Notes myNote = new Notes();

		// Initialize the Scanner method
		Scanner scan = new Scanner(System.in);

		System.out.println("test");

		System.out.println("\n===== Grades Tracker App =====");

		while (true) {
			System.out.println("\nSelect one of the following option");
			System.out.println("1. Add a new note");
			System.out.println("2. Delete a note");
			System.out.println("3. See all existing notes");
			System.out.println("4. Notes informations");
			System.out.println("5. Quit");

			// Ask user the menu he want to go in
			System.out.print("\nGo menu : ");
			int menuInput = scan.nextInt();

			try {
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
						boolean infoCheck = false;
						while (!infoCheck) {
							System.out.println("\nWhat do you want to know ? : ");
							System.out.println("1. Maximum note");
							System.out.println("2. Minimum note");
							System.out.println("3. Average of notes");
							System.out.println("4. Sum of all notes");
							System.out.println("5. Quit");
							int infoInput = scan.nextInt();

							switch (infoInput) {
								case 1:
									myNote.calculateMax(myNote.notesList);
									infoCheck = true;
									break;

								case 2:
									myNote.calculateMin(myNote.notesList);
									infoCheck = true;
									break;

								case 3:
									myNote.calculateAvg(myNote.notesList);
									infoCheck = true;
									break;

								case 4:
									myNote.calculateSum(myNote.notesList);
									infoCheck = true;
									break;

								case 5:
									System.out.println("Exiting...");
									infoCheck = true;
									break;

								default:
									infoCheck = true;
									break;
							}
						}

						break;
					case 5:
						System.out.println("Exiting...");
						System.exit(0);
						break;

					default:
						break;
				}
			} catch (InputMismatchException e) {
				System.err.println("ERROR : Wrong input !");
				scan.next();
			}

		}

	}
}
