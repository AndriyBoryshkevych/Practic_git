package lpr2_4;

import java.util.Scanner;
import java.lang.Math;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ���������� ����� ������ ������ �����
		System.out.printf("������ �����, �� ������� ���� ������: \n 1-��������� \n 2-����������� \n 3-���� \n");
		int number_room;
		double square, p;
		Scanner in = new Scanner(System.in);
		number_room = in.nextInt();
		switch (number_room) {
		case 1: {
			int a, b, c;
			System.out.println("������ ��� ������� ����������");
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			p = (a + b + c);
			square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("����� �������� ������:" + square);
			break;
		}
		case 2: {
			int a, b;
			System.out.println("������ �� ������� ������������");
			a = in.nextInt();
			b = in.nextInt();
			square = a * b;
			System.out.println("����� ����������� ������:" + square);
			break;
		}
		case 3: {
			int a;
			System.out.println("������ ����� ���� ");
			a = in.nextInt();
			square = Math.PI * Math.pow(a, 2);
			System.out.println("����� ������ ������:" + square);

		}
		default: {
			System.out.println("�� ��������� ����� �����!");
		}

		}
	}

}
