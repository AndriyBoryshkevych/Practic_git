package lpr2_4;

import java.util.Scanner;

public class lpr_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		//знайти мах ≥ м≥н серед тьрох чисел*************
//		// дан≥ ввод€тьс€ з клав≥атури
//		int a, b, c;
//		Scanner in = new Scanner(System.in);
//		System.out.println("a=");
//		a = in.nextInt();
//		System.out.println("b=");
//		b = in.nextInt();
//		System.out.println("c=");
//		c = in.nextInt();
//
//		int max, min;
//		max = (a > b) ? a : b; // €кщо а>б тод≥ мах=а, иначе мах=b
//		if ((a > b) && (a > c)) {
//			max = a;
//		} else if ((b > a) && (b > c)) {
//			max = b;
//		} else {
//			max = c;
//		}
//		System.out.println("max="+max);
//		
//		min = (a < b) ? a : b; // €кщо а<б тод≥ min=а, иначе min=b
//		if ((a < b) && (a < c)) {
//			min = a;
//		} else if ((b < a) && (b < c)) {
//			min = b;
//		} else {
//			min = c;
//		}
//		System.out.println("min="+min);
//		//******************

		// високосний р≥к?***************
//		int a;
//		Scanner in = new Scanner(System.in);
//		System.out.println("¬вед≥ть р≥к (в межах 1900-3000)):");
//		a = in.nextInt();
//
//		if ((a >= 1900) && (a <= 3000)) {
//			if (((a % 4 == 0) && (a % 100 > 0)) || (a % 400 == 0)) {
//				System.out.println("÷ей р≥к високосний");
//			} else {
//				System.out.println("÷ей р≥к звичайний");
//			}
//		} else
//			System.out.println("¬ведений р≥к не входить в задан≥ меж≥!");
		// *****************

		// тижпрограм≥ст**************
		int kvo,a,b;
		b=0;
		Scanner in = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть програм≥ст≥в:");
		kvo = in.nextInt();
		a=kvo;
		if (a>=100)
		{a=a%100;}
		if ((a>=10)&&(a<=20)) 
			{System.out.println(kvo+" програм≥ст≥в");}
		if ((a>=1)&&(a<=9)||(a>20)) 
			{
			if (a%10==1) {System.out.println(kvo+" програм≥ст");}
			if ((a%10==2)||(a%10==3)||(a%10==4)) {System.out.println(kvo+" програм≥сти");}
			if ((a%10==5)||(a%10==6)||(a%10==7)||(a%10==9)||(a%10==0)) {System.out.println(kvo+" програм≥ст≥в");}
			}			
		
		// ******************
	}

}
