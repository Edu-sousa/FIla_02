package controller;

import br.edu.fateczl.filaobj.Fila;

public class Ex02Controller {	

	public Ex02Controller() {
		super();
	}

	public void insereLigação(Fila f,String numeroTelefone) {
		//insere números de telefone em uma fila iniciada
		int numero = Integer.parseInt(numeroTelefone);
		f.insert(numero);
	}
	
	public void consultaoLigacoes(Fila f) throws Exception {
		// desenfilera cada ligação realizada e exibe no console. Exibir uma exceção caso não haja ligação
		f.list();
	}
}
