package Animais;

import HabilidadeDeVoar.PodeVoar;
import HierarquiaDeAnimais.Ave;

public class Pato extends Ave{

	public Pato() {
		super.habilidadeVoarObj = new PodeVoar();
	}
	
	@Override
	public String emitirSom() {
		return "grasnido";
	}
}
