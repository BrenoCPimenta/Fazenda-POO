package Animais;

import HabilidadeDeVoar.PodeVoar;
import HierarquiaDeAnimais.Mamifero;

public class Morcego extends Mamifero{

	public Morcego() {
		super.habilidadeVoarObj = new PodeVoar();
	}
	
	@Override
	public String emitirSom() {
		return "farfalho";
	}
}
