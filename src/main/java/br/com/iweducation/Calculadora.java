package br.com.iweducation;

public class Calculadora {

	public int soma(String entrada) {

		if (entrada.equals("")) {
			return 0;
		}
		
		String[] vetor = entrada.split(",");

		int resultado = 0;

		for (String numero : vetor) {
			
			int inteiro = Integer.parseInt(numero);
			
			if(inteiro < 0) {
				throw new IllegalArgumentException("O numero deve ser positivo");
			}
			
			if(Integer.parseInt(numero) >= 1000) {
				continue;
			}
			
			resultado = resultado + inteiro;
		}

		return resultado;

	}

}
