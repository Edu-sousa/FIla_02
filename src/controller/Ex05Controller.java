package controller;

import br.edu.fateczl.filaobj.*;
import model.Ex05Pessoa;

public class Ex05Controller {

	public Ex05Controller() {
		super();
	}
	
	//Exibir o nome do cliente, se passou para dentro do brinquedo ou não e a razão
	public void brinquedo(Fila fila) throws Exception {

		while (!fila.isEmpty()) {
			Ex05Pessoa cliente = (Ex05Pessoa) fila.remove();

			//Verificar se a pessoa está em condições de ir ao brinquedo
			if (cliente.getIdade() > 16 && cliente.getAltura() > 1.60) {
				System.out.println(cliente.getNome() + "	Entrada Livre para o Boomerang.");
			} else {
				if (cliente.getIdade() <= 16 && cliente.getAltura() <= 1.60) {
					System.out.println(cliente.getNome() + "	Entrada Barrada, é muito novo e baixo.");
				} else if (cliente.getIdade() <= 16) {
					System.out.println(cliente.getNome() + "	Entrada Barrada, é muito novo.");
				} else {
					System.out.println(cliente.getNome() + "	Entrada Barrada, é muito baixo.");
				}
			}
		}
	}
}
