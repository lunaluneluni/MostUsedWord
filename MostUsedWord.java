import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class MostUsedWord {

	// Created by Luna

	static String finder(ArrayList<String> book) {

		String mostUsed = "";
		int count = 0;
		int frequency = 0;

		for (String word : book) {

			// count is set to 0 per iteration
			count = 0;

			// Comparing the current element to the next elements in the array list
			for (String nextWord : book) {

				if (word.equals(nextWord)) {
					count++;
				}
			}

			if (count > frequency) {
				mostUsed = word;
				frequency = count;
			}

		}

		return mostUsed;

	}

	public static void main(String[] args) throws IOException, FileNotFoundException {

		Scanner scan = new Scanner(new File("book.txt"));
		ArrayList<String> book = new ArrayList<>();

		while (scan.hasNext()) {

			book.add(scan.next());
		}

		System.out.println("The most used word is \"" + finder(book) + "\"");

	}

}
