package view;

import br.edu.fateczl.filaobj.Fila;
import controller.Ex05Controller;
import model.Ex05Pessoa;

public class Ex05Principal {

	public static void main(String[] args) throws Exception {

		Fila f = new Fila();
		Ex05Controller parque = new Ex05Controller();

		for (int i = 1; i <= 30; i++) {

			String pessoa = "Cliente " + i; // define nome
			int idade = (int) (Math.random() * 31) + 10; // define idade
			float altura = (float) ((Math.random() * 0.75) + 1.35);// define altura

			f.insert(new Ex05Pessoa(pessoa, idade, altura));
		}
		
		parque.brinquedo(f);

//		
//		for (int i = 0; i <= 30; i++) {
//			String pessoa = "Pessoa " + i;
//			
//			System.out.println(pessoa);
//
//		}

	}
}
