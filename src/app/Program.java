package app;

import java.util.Locale;
import java.util.Scanner;

import entities.KilometroDiario;
import entities.Motoboy;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Dias trabalhados na semana: ");
		int n = sc.nextInt();
		
		Motoboy motoboy = new Motoboy(nome);
		
		for(int i = 1; i <= n; i++){
			System.out.println("Dados do dia [" + i + "]: ");
			System.out.print("Km inicial: ");
			double kmInicial = sc.nextDouble();
			System.out.print("Km final: ");
			double kmFinal = sc.nextDouble();
			
			KilometroDiario kmDiario = new KilometroDiario(kmInicial, kmFinal);
		
			motoboy.addKmDiario(kmDiario);
		}
		
		motoboy.setTotalCombustivel(motoboy.somaCombustivel());
		System.out.println();
		System.out.println("RESUMO SEMANAL:");
		System.out.println("Motoby: " + motoboy.getNome());
		System.out.printf("Km total (semana): %.2f%n", motoboy.distanciaTotal());
		System.out.printf("Total combustivel: R$ %.2f%n", motoboy.getTotalCombustivel());
		
		sc.close();
	}

}
