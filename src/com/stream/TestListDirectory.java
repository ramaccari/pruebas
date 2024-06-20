package com.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestListDirectory {

	public static void main(String[] args) {
		try {
			Files.list(Paths.get("./files")).forEach(System.out::println);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

