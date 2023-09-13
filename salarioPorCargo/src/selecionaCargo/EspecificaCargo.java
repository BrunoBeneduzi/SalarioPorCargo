package selecionaCargo;

public class EspecificaCargo {

	public String defineCargo(int escolha) {
		String cargoEscolhido = null;
		switch(escolha) {
		case 1:
			 cargoEscolhido = "Auxiliar Administrativo";
			break;
		case 2:
			cargoEscolhido = "Auxiliar Financeiro";
			break;
		case 3:
			cargoEscolhido = "Auxiliar de Informatica";
			break;
		case 4:
			cargoEscolhido = "Gerente";
			break;
		case 5:
			cargoEscolhido = "Presidente";
			break;
		default:
			System.out.println("Digite um Codigo valido");
			return null;
		}
		return cargoEscolhido;
		
	}
	
}