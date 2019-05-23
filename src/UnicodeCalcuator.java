import java.util.Scanner;

public class UnicodeCalcuator {
	public static void main(String[] args) {

		String strStringOne;
		String strStringTwo;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter string one");
		strStringOne = scanner.nextLine();

		System.out.println("Please enter string two");
		strStringTwo = scanner.nextLine();

		int intCalculateUnicodeValueForStringOne = 0;
		int intCalculateUnicodeValueForStringTwo = 0;

		for (int intGetUnicode = 0; intGetUnicode < strStringOne.length(); intGetUnicode++) {
			char character = strStringOne.charAt(intGetUnicode);
			intCalculateUnicodeValueForStringOne = intCalculateUnicodeValueForStringOne
					+ ((int) character);
		}
		System.out.println("Unicode sum value for string one: "
				+ intCalculateUnicodeValueForStringOne);

		for (int intGetUnicode = 0; intGetUnicode < strStringTwo.length(); intGetUnicode++) {
			char character = strStringTwo.charAt(intGetUnicode);
			intCalculateUnicodeValueForStringTwo = intCalculateUnicodeValueForStringTwo
					+ ((int) character);
		}
		System.out.println("Unicode sum value for string two: "
				+ intCalculateUnicodeValueForStringTwo);

		if (intCalculateUnicodeValueForStringOne > intCalculateUnicodeValueForStringTwo) {
			System.out
					.println("Difference(as absolute value): "
							+ (intCalculateUnicodeValueForStringOne - intCalculateUnicodeValueForStringTwo));
		} else {
			System.out
					.println("Difference(as absolute value): "
							+ (intCalculateUnicodeValueForStringTwo - intCalculateUnicodeValueForStringOne));
		}
	}
}