package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, area;
		do {
			base = sc.nextDouble();
		} while (base > 0);
		do {
			altura = sc.nextDouble();
		} while (altura > 0);
		area = base * altura;
		System.out.print(area);
	}
}
