package com.cubem10.quadraticequation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("ax²+bx+c=0 형태로 나타낸뒤 각 a,b,c에 해당하는 수를 입력해 주세요!");
		Scanner aget = new Scanner(System.in);
		System.out.print("a를 입력해주세요: ");
		int a = aget.nextInt();
		Scanner bget = new Scanner(System.in);
		System.out.print("b를 입력해주세요: ");
		int b = bget.nextInt();
		Scanner cget = new Scanner(System.in);
		System.out.print("c를 입력해주세요: ");
		int c = cget.nextInt();
		if ((b*b)-(4*a*c) < 0) System.out.println("\n근이 없습니다. ");
		else if ((b*b)-(4*a*c) == 0) System.out.println("\n" + -(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a) + " 이란 중근을 가집니다");
		else if ((b*b)-(4*a*c) > 0) System.out.println("\n" + -(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a) + "과 " + -(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a) + "라는 두 개의 근을 가집니다.");
	}

}
