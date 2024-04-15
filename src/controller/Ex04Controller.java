package controller;

import br.edu.fateczl.filaobj.*;

public class Ex04Controller {

	public void insereDocumento(Fila f, String documento) {
		f.insert(documento);
	}

	public void imprime(Fila f) throws Exception {

		while (!f.isEmpty()) {

			String doc = (String) f.remove();
			System.out.println("[#PC: "+doc+" ]");
			int temp = (int) ((Math.random() * 1000) + 1000);

			Thread.sleep(temp);
		}
	}
}
