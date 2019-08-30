package HierarquiaDeAnimais;

public abstract class Ave extends Animal{

	public Ave() {
		super.setTipoDeCobertura("Penas");
	}
	
	@Override
	public String acaoComoCordado() {
		return "colocar ovos";
	}	
}

