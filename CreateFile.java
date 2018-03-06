package Beel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file = new File("New");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}
		String MessageToWrite = "Hello! I am from Bangladesh";
		File file2 = new File("New\\Baharul.txt");
		if (!file2.exists()) {
			if (file2.createNewFile()) {
				try {
					FileWriter write = new FileWriter(file2.getAbsolutePath(), true);
					BufferedWriter bw = new BufferedWriter(write);
					bw.write(MessageToWrite);
					bw.close();
				} catch (IOException e) {
					e.getMessage();
					System.out.println("File writer not found");
				}
			} else {
				System.out.println("Not possible to write  the file");
			}
		}

	}

}
