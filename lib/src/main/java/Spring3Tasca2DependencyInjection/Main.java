package Spring3Tasca2DependencyInjection;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conversor aDolars= new EurosDolar();
		Conversor aLliures=new EurosLliures();
		System.out.println("Introdueix quantitat en Euros:");
		float euros = sc.nextFloat();
		System.out.println("El preu es de: "+euros+" €");
		
		MostraPreus mostraPreus = new MostraPreus(euros, aDolars);
		mostraPreus.imprimir();
		mostraPreus = new MostraPreus(euros, aLliures);
		mostraPreus.imprimir();
		
		
		

	}

}
