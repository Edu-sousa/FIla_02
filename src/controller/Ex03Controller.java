package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Ex03Processos;

public class Ex03Controller {

	public void escalonador(Fila f) throws Exception {
		while (!f.isEmpty()) {
			Ex03Processos processo = (Ex03Processos) f.remove();

			if (processo.getQtdRetornos() > 1) {
				processo.setQtdRetornos(processo.getQtdRetornos() - 1);
				System.out.println("Processo "+processo.getNome()+"	Retornos "+processo.getQtdRetornos());
			}
			f.insert(processo);
		}
	}
}
