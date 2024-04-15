package controller;

import br.edu.fateczl.filaobj.Fila;

public class Ex02Controller {	

	public Ex02Controller() {
		super();
	}

	public void insereLiga��o(Fila f,String numeroTelefone) {
		//insere n�meros de telefone em uma fila iniciada
		int numero = Integer.parseInt(numeroTelefone);
		f.insert(numero);
	}
	
	public void consultaoLigacoes(Fila f) throws Exception {
		// desenfilera cada liga��o realizada e exibe no console. Exibir uma exce��o caso n�o haja liga��o
		f.list();
	}
}
