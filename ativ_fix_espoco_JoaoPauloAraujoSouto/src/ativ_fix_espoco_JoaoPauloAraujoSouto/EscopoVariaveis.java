package ativ_fix_espoco_JoaoPauloAraujoSouto;

public class EscopoVariaveis {
	private int valor; 
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		valor = valor + 10;
		return valor;
	}

}
