import java.util.ArrayList;
import java.util.Scanner;

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
		Notes.noteNumber = Notes.scan.nextInt();
		Notes.notesList.add(Notes.noteNumber);
	}

	public void deleteNote() {
		System.out.println("\n===== Delete note =====");

		System.out.println("Do you want to see all of the existings note ? (y/n) : ");
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

		} else {
			System.out.print("\nEnter the number of the note you want to delete : ");
			int noteToDeleteNumber = scan.nextInt();
			if (notesList.contains(noteToDeleteNumber)) {
				Notes.notesList.remove(noteToDeleteNumber);
			} else {
				System.out.println("There is no note having this number");
			}
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
		System.out.println("\n===== Notes Average =====");

		if (Notes.notesList.size() != 0) {
			int sum = 0;

			for (int note : Notes.notesList) {
				sum += note;
			}

			double avg = (double) sum / Notes.notesList.size();

			System.out.println("Note average = " + avg);
		} else {
			System.out.println("There is no notes to display !");
		}
	}
}
