package Animais;

import HabilidadeDeVoar.NaoVoa;
import HierarquiaDeAnimais.Ave;

public class Galinha extends Ave{

	public Galinha() {
		super.habilidadeVoarObj = new NaoVoa();
	}
	
	@Override
	public String emitirSom() {
		return "cacarejo";
	}
}
