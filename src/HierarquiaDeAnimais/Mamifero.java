package HierarquiaDeAnimais;

public abstract class Mamifero extends Animal{

	public Mamifero() {
		super.setTipoDeCobertura("Pelo");
	}

	@Override
	public String acaoComoCordado() {
		return "amamentar";
	}	
}

