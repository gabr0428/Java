package curso_programacao;

import java.util.Scanner;

public class Exercicio {
	
		
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String product1 = "Computer";
		String product2 ="Office desk";
		
		int age = 30;
		int code = 5290;
		char gender ='F';
		
		double price1 = 2100.0;
		double price2 = 650.20;
		double masure = 53.234567;
		
		System.out.println("Products:");
		System.out.println(product1 + ", which price is $" + price1);
		System.out.println(product2 + ", which price is $" + price2 );
		
		System.out.println("Record:" + age + "years old, code " + code + " and gender:" + gender);
		
		System.out.println("Masue with eight decimal places:" + masure);
		System.out.println("US decimal point:" + masure);
		
		
		int x ;
		x = sc.nextInt();

		sc.close();
		System.out.println();
	}
}
