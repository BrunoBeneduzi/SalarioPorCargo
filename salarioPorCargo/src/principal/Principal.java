package principal;

import atributosCargo.Atributos;
import selecionaCargo.EspecificaCargo;
import selecionaCargo.Seleciona;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		EspecificaCargo defineCargo = new EspecificaCargo();
		String cargoEscolhido = null;
		
		System.out.print("Bem vindo ao programa que verifica qual o salario atual de cada cargo\n"+"1-Auxiliar Administrativo\n"
		+"2-Auxiliar Financeiro\n"+"3-Auxilair de Informatica\n"+"4-Gerente\n"+"5-Presidente\n"+"-> ");
		
		try {
			escolha = sc.nextInt();
		
			cargoEscolhido = defineCargo.defineCargo(escolha);
		
			Atributos cargo = new Atributos(cargoEscolhido);
			Seleciona teste = new Seleciona();
		
			System.out.println("O salario do cargo "+cargoEscolhido+" é de "+teste.calcula(cargo)+" R$");
			
		}catch(Exception e) {
			System.out.println(".................Digite um numero valido, Programa finalizado................");
		}
		
		

	}

}