package lpr2_4;

import java.util.Scanner;
import java.lang.Math;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// обчислення площі кімнати заданої форми
		System.out.printf("Введіть номер, що відповідає формі кімнати: \n 1-трикутник \n 2-прямокутник \n 3-коло \n");
		int number_room;
		double square, p;
		Scanner in = new Scanner(System.in);
		number_room = in.nextInt();
		switch (number_room) {
		case 1: {
			int a, b, c;
			System.out.println("Веддіть три сторони трукутника");
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			p = (a + b + c);
			square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("Площа трикутної кімнати:" + square);
			break;
		}
		case 2: {
			int a, b;
			System.out.println("Веддіть дві сторони прямокутника");
			a = in.nextInt();
			b = in.nextInt();
			square = a * b;
			System.out.println("Площа прямокутниої кімнати:" + square);
			break;
		}
		case 3: {
			int a;
			System.out.println("Веддіть радіус кола ");
			a = in.nextInt();
			square = Math.PI * Math.pow(a, 2);
			System.out.println("Площа круглої кімнати:" + square);

		}
		default: {
			System.out.println("не правильно ввели номер!");
		}

		}
	}

}
