package Animais;

import HabilidadeDeVoar.NaoVoa;
import HierarquiaDeAnimais.Mamifero;

public class Vaca extends Mamifero{

	public Vaca() {
		super.habilidadeVoarObj = new NaoVoa();
	}
	
	@Override
	public String emitirSom() {
		return "mugido";
	}
}
