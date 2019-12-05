package lpr2_4;

import java.lang.Math;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.7, b = 0.05, x = 0.5, R, S;

		R = Math.pow(x, 2) * (x + 1) / b - Math.pow(Math.sin(x + a), 2);
		S = Math.sqrt(x * b / a) + Math.pow(Math.cos(Math.pow(x + b, 3)),2);
		System.out.printf("R= %.2f \n", R);
		System.out.printf("S= %.2f", S);
 //commit5
	}

}
Hello8
messeg44
