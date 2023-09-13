package cargos;

import atributosCargo.Atributos;

public class AuxInformatica extends Cargo{

	public AuxInformatica(Cargo proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcula(Atributos salario) {
		if(salario.getCargo().equalsIgnoreCase("Auxiliar de Informatica")) {
			return 3500;
		}
		return proximo.calcula(salario);
	}

}
