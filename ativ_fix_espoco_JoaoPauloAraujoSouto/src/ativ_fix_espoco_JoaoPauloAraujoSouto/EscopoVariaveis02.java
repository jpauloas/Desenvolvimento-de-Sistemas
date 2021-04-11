package ativ_fix_espoco_JoaoPauloAraujoSouto;

public class EscopoVariaveis02 {
	public static void main(String[] args) {
		EscopoVariaveis escopo = new EscopoVariaveis();
		
		escopo.setValor(10);
		
		System.out.println(escopo.getValor());
		System.out.println(escopo.calculaValor(20));
		System.out.println(escopo.getValor());
		
		}
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
			
		public int Teste() {
			int valor = 5;
			if(true) {
				valor--;			
			}
			this.valor = valor;
			return valor;
		}
		
		public void outroTeste() {
			for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
		}
		public void maisUmTeste() {
			boolean flag = true;
			if(flag) {
				int umaVariavel = 10;
				umaVariavel++;
				System.out.println(umaVariavel);
					
			}
		}

}
