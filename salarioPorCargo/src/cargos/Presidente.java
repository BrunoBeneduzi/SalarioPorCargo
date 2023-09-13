package cargos;

import atributosCargo.Atributos;

public class Presidente extends Cargo{

	public Presidente(Cargo proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Atributos salario) {
		if(salario.getCargo().equalsIgnoreCase("Presidente")) {
			return 90000.55;
		}
		return proximo.calcula(salario);
	}

}
