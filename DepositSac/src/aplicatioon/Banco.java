// FELIPE GUEDES
// SISTEMA DE CONTA PARA DEPOSITO E SAQUE(COM TAXA NO SAQUE DE 5%)
package aplicatioon;

import java.util.Locale;
import java.util.Scanner;

import entities.conta1;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		conta1 conta;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char responsive = sc.next().charAt(0);

		if (responsive == 'y') {
			System.out.println("Enter initial deposit value: ");
			double DepositValue = sc.nextDouble();
			conta = new conta1(number, name, DepositValue);
		} else {

			conta = new conta1(number, name);
		}

		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(conta);

		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		conta.deposit(amount);
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(conta);
		
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		double withdaw = sc.nextDouble();
		conta.withdaw(withdaw);
		System.out.println("");
		System.out.println("Account data: ");
		System.out.println(conta);
		
		

		sc.close();

	}
}