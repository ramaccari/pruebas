package com.java.examen;

public class TestJava3 {

	static int[] myArray = {1,3,4,2,7,0};
	
	public static void main(String[] args) {
        int targetSum = 10;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] + myArray[j] == targetSum) {
                    System.out.println(myArray[i] + " " + myArray[j]);
                    break; // Solo necesito una pareja
                }
            }
        }
	}

}
