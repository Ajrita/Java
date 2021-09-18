package java1;

public class InfinitiveLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Napisati program koji ce imati infinite loop i stampati "Hello world!" WHILE

		int i = 1;
		i *= i;
		while (i == 1) {

			System.out.println("Hello world!");

		}

	}
} //19.8.