package atv015;

public class Funcionarios extends Pessoa {
	private String FUNCAO;
	private String TURNO;
	
	
	public String getfuncao() { 
		return FUNCAO;
	}
	
	public void setfuncao(String funcao) {
		this.FUNCAO = funcao;
	}

	public String getturno() {
		return TURNO;
	}
	
	public void setturno(String turno) {
		this.TURNO = turno;
	}

}
