package calculodegastos;

import java.util.Scanner;

public class CalculoDeGastos{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double TotalGasto, ValorCombustivel, Consumo= 6.5; 
		double Distancia, ValorPedagio, LitrosUtilizados;		

		System.out.print("Programa de cálculo da quantidade de litros de combustível gasta em uma viagem\n\n");
		
                System.out.print("Por favor, digite a Distancia em que você fez o percurso (km) : ");
		Distancia = entrada.nextDouble();
		
                System.out.print("Por favor, digita o valor do litro do combustivel que vc pagou na sua viagem : ");
		ValorCombustivel = entrada.nextDouble();
                
		System.out.print("Por favor, digita o valor do pedagio que vc gastou na sua viagem : ");
		ValorPedagio = entrada.nextDouble();
         
		
		LitrosUtilizados= Distancia / Consumo;
		TotalGasto = ValorCombustivel + ValorPedagio;


		System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Valor total gasto: " + TotalGasto + "total\n");
		System.out.print("Quantidade de Combustível utilizado: " + LitrosUtilizados + "litros\n");
                

	}

}