package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite o número de funcionarios: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados Funcionario #" + i);
			System.out.print("Terceirizado? (S/N)");
			String terceirizado = sc.nextLine();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHoras = sc.nextDouble();
			
			if (terceirizado == "S") {
				System.out.print("Despesa Adicional: ");
				double despesaAdicional = sc.nextDouble();
		
				Funcionario func = new FuncionarioTerceirizado(nome, horas, valorPorHoras, despesaAdicional);
				lista.add(func);
			} else {
				Funcionario func = new Funcionario(nome, horas, valorPorHoras);
				lista.add(func);
			}
			
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for (Funcionario func : lista) {
			System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));
		}
		
				
		sc.close();

	}

}
