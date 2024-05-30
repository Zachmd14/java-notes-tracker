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

	/**
	 * METHOD
	 * Create a new note
	 */
	public void createNote() {
		System.out.print("Enter your note title: ");
		Notes.noteTitle = Notes.scan.nextLine();
		Notes.titleArray.add(Notes.noteTitle); // Add the note title to the titleArray
		System.out.println("Title: " + Notes.noteTitle);
	}

	public void seeNotes() {
		for (int i = 0; i < Notes.titleArray.size(); i++) {
			System.out.println(Notes.titleArray.get(i));
		}
	}
}
