package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.Ex02Controller;

public class Ex02Principal {

	public static void main(String[] args) throws Exception {

		Fila fila = new Fila();
		int escolha = 1;
		String tel = null;

		Ex02Controller telefone = new Ex02Controller();

		while (escolha != 0) {

			escolha = Integer.parseInt(
					JOptionPane.showInputDialog("Escolha\n 1 - Fazer Ligações \n 2 - Consultar Ligações \n 0 - Sair"));

			switch (escolha) {
			case 1:
				String numero = JOptionPane.showInputDialog("Digite o numero do telefone");
				telefone.insereLigação(fila,numero);
				break;
			case 2:
				telefone.consultaoLigacoes(fila);
				break;
			case 0:
				escolha = 0;
				break;
			}
		}
	}
}
