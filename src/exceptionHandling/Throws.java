package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Throws {
	public class ThrowsExample {
		static void readFile() throws IOException {
			FileReader file = new FileReader("nonexistent.txt"); // File not found
		}

		public static void main(String[] args) {
			try {
				readFile();
			} catch (IOException e) {
				System.out.println("File not found!");
			}
		}
	}

}
