import java.util.ArrayList;
import java.util.Scanner;

public class Notes {

	// instances
	static ArrayList<Integer> numberArray = new ArrayList<>();
	static ArrayList<String> titleArray = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static String noteTitle;

	// Constructor
	public Notes() {
		// No initialization needed here for now
	}

	public void createNote() {
		System.out.println("\n===== New note =====");
		System.out.print("\nEnter your note title: ");
		Notes.noteTitle = Notes.scan.nextLine();
		Notes.titleArray.add(Notes.noteTitle);
	}

	public void deleteNote() {
		System.out.println("\n===== Delete note =====");

		System.out.println("Do you want to see all of the existings note ? (y/n) : ");
		String userValidation = scan.nextLine();
		if (userValidation == "y") {
			this.seeNotes();
			System.out.print("\nEnter the number of the note you want to delete : ");
			int noteToDeleteNumber = scan.nextInt();
			if (titleArray.contains(noteToDeleteNumber)) {
				Notes.titleArray.remove(noteToDeleteNumber);
			} else {
				System.out.println("There is no note having this number");
			}

		} else {
			System.out.print("\nEnter the number of the note you want to delete : ");
			int noteToDeleteNumber = scan.nextInt();
			if (titleArray.contains(noteToDeleteNumber)) {
				Notes.titleArray.remove(noteToDeleteNumber);
			} else {
				System.out.println("There is no note having this number");
			}
		}
	}

	public void seeNotes() {
		System.out.println("\n===== Note list ===== ");
		for (int i = 0; i < Notes.titleArray.size(); i++) {
			System.out.println((i + 1) + " : " + Notes.titleArray.get(i));
		}
	}
}
