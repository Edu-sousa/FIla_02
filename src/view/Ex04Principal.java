package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.Ex04Controller;

public class Ex04Principal {

	public static void main(String[] args) throws Exception {

		Fila fila = new Fila();
		Ex04Controller impressora = new Ex04Controller();

		int numero = 9;
		while (numero != 0) {

			numero = Integer
					.parseInt(JOptionPane.showInputDialog("Escolha \n1- Inserir Documentos \n2- Imprimir Documentos \n0- Sair"));

			switch (numero) {
			case 1:
				String doc= JOptionPane.showInputDialog("Nome do documento");
				doc = "ID_PC "+doc;
				impressora.insereDocumento(fila, doc);
				break;
			case 2:
				impressora.imprime(fila);
				break;
			case 0:
				numero = 0;
				break;
			}
		}
	}
}
