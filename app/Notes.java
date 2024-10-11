import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;

public class Notes {

	// instances
	static ArrayList<Integer> notesList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int noteNumber;

	// Constructor
	public Notes() {
		// No initialization needed here for now
	}

	public void createNote() {
		System.out.println("\n===== New note =====");
		System.out.print("\nEnter your note number: ");

		try {
			Notes.noteNumber = Notes.scan.nextInt();
			Notes.notesList.add(Notes.noteNumber);
		} catch (InputMismatchException e) {
			System.err.println("ERROR : Wrong input !");
			scan.next();
		}
	}

	public void deleteNote() {
		System.out.println("\n===== Delete note =====");
		System.out.println("Do you want to see all of the existings note ? (y/n) : ");
		try {
			String userValidation = scan.nextLine();
			if (userValidation == "y") {
				this.seeNotes();
				System.out.print("\nEnter the number of the note you want to delete : ");
				int noteToDeleteNumber = scan.nextInt();

				if (notesList.contains(noteToDeleteNumber)) {
					Notes.notesList.remove(noteToDeleteNumber);
				} else {
					System.out.println("There is no note having this number");
				}

			} else

			{
				System.out.print("\nEnter the number of the note you want to delete : ");
				int noteToDeleteNumber = scan.nextInt();
				if (notesList.contains(noteToDeleteNumber)) {
					Notes.notesList.remove(noteToDeleteNumber);
				} else {
					System.out.println("There is no note having this number");
				}
			}

		} catch (InputMismatchException e) {
			System.err.println("ERROR : Wrong input !");
			scan.next();
		}

	}

	public void seeNotes() {
		System.out.println("\n===== Note list ===== ");
		if (Notes.notesList.size() != 0) {
			for (int i = 0; i < Notes.notesList.size(); i++) {
				System.out.println((i + 1) + " : " + Notes.notesList.get(i));
			}
		} else {
			System.out.println("There is no notes to display !");
		}
	}

	public void calculateAvg(ArrayList<Integer> notesList) {
		System.out.println("\n===== Notes Informations =====");

		if (Notes.notesList.size() != 0) {
			int sum = 0;

			for (int note : Notes.notesList) {
				sum += note;
			}

			double avg = (double) sum / Notes.notesList.size();

			System.out.println("Note average : " + avg);
		} else {
			System.out.println("There is no notes to display !");
		}
	}

	public void calculateSum(ArrayList<Integer> notesList) {
		System.out.println("\n===== Notes Informations =====");

		if (Notes.notesList.size() != 0) {
			int sum = 0;

			for (int note : Notes.notesList) {
				sum += note;
			}

			System.out.println("Notes sum : " + sum);
		} else {
			System.out.println("There is no notes to display !");
		}
	}

	public void calculateMax(ArrayList<Integer> notesList) {
		System.out.println("\n===== Notes Informations =====");

		if (Notes.notesList.size() != 0) {
			System.out.println("Maximum note : " + Collections.max(notesList));
		} else {
			System.out.println("There is no notes to display !");
		}
	}

	public void calculateMin(ArrayList<Integer> notesList) {
		System.out.println("\n===== Notes Informations =====");

		if (Notes.notesList.size() != 0) {
			System.out.println("Mininum note : " + Collections.min(notesList));
		} else {
			System.out.println("There is no notes to display !");
		}
	}

}
