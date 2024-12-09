package stringclassAndPrinting;

public class SwapStrings {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = "Python";

		System.out.println("Before Swapping: " + str1 + " " + str2);

		str1 = str1 + str2;// JavaPython

		str2 = str1.substring(0, str1.length() - str2.length());// str1.substring(0,4);first 4 characters "Java"

		str1 = str1.substring(str2.length());// str1.substring(4); extract substring startig from 4th index "Python"

		System.out.println("After Swapping: " + str1 + " " + str2);

	}
}
