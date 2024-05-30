import java.util.ArrayList;
import java.util.Scanner;

public class Notes {

	private class Note {

		private String title;
		private int number;

		public Note(String title, int number) {
			this.title = title;
			this.number = number;
		}

		public String getTitle() {
			return title;
		}

		public int number() {
			return number;
		}

		// ArrayList to score notes
		private ArrayList<Note> noteList = new ArrayList<>();

		public void addNote() {

		}
	}
}
