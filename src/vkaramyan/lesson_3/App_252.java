package vkaramyan.lesson_3;

public class App_252 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { -4, 23, -1, 3, 4, 17, 13, 8, 9, 6 };
		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println(" min : " + min);
	}

}
