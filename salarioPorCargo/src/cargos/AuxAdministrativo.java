package cargos;

import atributosCargo.Atributos;


public class AuxAdministrativo extends Cargo {

	public AuxAdministrativo(Cargo proximo) {
		super(proximo);
	}

	@Override
	public double calcula(Atributos salario) {
		if(salario.getCargo().equalsIgnoreCase("Auxiliar Administrativo")) {
			return 1500;
		}
		return proximo.calcula(salario);
	}



}