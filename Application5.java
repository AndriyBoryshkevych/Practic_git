package lpr2_4;

public class Application5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int S = 0;
		while (i <= 10) {
			S += i;
			i++;
		}
		System.out.println("S=" + S);

		S = 0;
		for (i = 1; i <= 10; i++) {
			S += i;
		}
		System.out.println("S=" + S);

	}
}