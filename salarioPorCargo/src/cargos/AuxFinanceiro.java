package cargos;

import atributosCargo.Atributos;

public class AuxFinanceiro extends Cargo{

	public AuxFinanceiro(Cargo proximo) {
		super(proximo);
	}

	@Override
	public double calcula(Atributos salario) {
		if(salario.getCargo().equalsIgnoreCase("Auxiliar Financeiro")) {
			return 2500;
		}
		return proximo.calcula(salario);
	}

}
