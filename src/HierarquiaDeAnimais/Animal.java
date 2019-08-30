package HierarquiaDeAnimais;

import HabilidadeDeVoar.*;

public abstract class Animal {
	
	//Variaveis
	private int idade;
	private String tamanho;
	private String tipo_de_cobertura;
	private String cor_de_cobertura;	
	private String altura_de_voo = null;
	
	//Metodos
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
	public String getTipoDeCobertura() {
		return tipo_de_cobertura;
	}
	public void setTipoDeCobertura(String tipo_de_cobertura) {
		this.tipo_de_cobertura = tipo_de_cobertura;
	}
	public String getCorDeCobertura() {
		return cor_de_cobertura;
	}
	public void setCorDeCobertura(String cor_de_cobertura) {
		this.cor_de_cobertura = cor_de_cobertura;
	}
	public String getAlturaDeVoo() {
		return altura_de_voo;
	}
	public void setAltura_de_voo(String altura_de_voo) {
		this.altura_de_voo = altura_de_voo;
	}
		
	//Metodos Abstratos
	public abstract String emitirSom();
	public abstract String acaoComoCordado();
	
	
	//------------------------------HabilidadeDeVoar---------------------------------------
	public HabilidadeVoar habilidadeVoarObj;
	
	public void capacidadeDeVoo(HabilidadeVoar novaHabilidadeObj) {
		habilidadeVoarObj = novaHabilidadeObj;
	}
	public String tentarVoar() {
		return habilidadeVoarObj.voar();
	}
}
