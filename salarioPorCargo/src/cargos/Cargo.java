package cargos;

import atributosCargo.Atributos;

public abstract class Cargo {
	protected Cargo proximo;

	public Cargo(Cargo proximo) {
		this.proximo = proximo;
	}
	
	public abstract double calcula(Atributos salario);
 
}