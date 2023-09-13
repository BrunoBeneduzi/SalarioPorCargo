package selecionaCargo;

import atributosCargo.Atributos;
import cargos.AuxAdministrativo;
import cargos.AuxFinanceiro;
import cargos.AuxInformatica;
import cargos.Cargo;
import cargos.Gerente;
import cargos.Presidente;
import cargos.semCargo;

public class Seleciona {
	
	public double calcula(Atributos cargo1) {
		Cargo cargo = new AuxAdministrativo(new AuxFinanceiro(new AuxInformatica(new Gerente(new Presidente(new semCargo())))));
		
		return cargo.calcula(cargo1);
	}
}