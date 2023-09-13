package cargos;

import atributosCargo.Atributos;

public class Gerente extends Cargo {

	public Gerente(Cargo proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Atributos salario) {
		if(salario.getCargo().equalsIgnoreCase("Gerente")) {
			return 6500;
		}
		return proximo.calcula(salario);
	}

}
