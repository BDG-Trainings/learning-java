package vkaramyan.lesson_3;

public class App_250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 23, -1, 3, 4, 17, 13, 8, 9, 6 };
		int multiply = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 2) {
				multiply *= numbers[i];
			}
		}
		System.out.println("Result:" + Math.pow(multiply, 2));

	}

}
