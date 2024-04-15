package view;

import br.edu.fateczl.filaobj.Fila;
import controller.Ex03Controller;
import model.Ex03Processos;

public class Ex03Principal {

	public static void main(String[] args) throws Exception {
		
		Fila fila = new Fila();
		Ex03Controller escalonador = new Ex03Controller();
		
		
		String nomeProc1 = "notepad.exe";
		int retornos1 = 14;
		Ex03Processos processo1 = new Ex03Processos(nomeProc1, retornos1);
		fila.insert(processo1);
		
		String nomeProc2 = "write.exe";
		int retornos2 = 35;
		Ex03Processos processo2 = new Ex03Processos(nomeProc2, retornos2);
		fila.insert(processo2);
		
		String nomeProc3 = "chrome.exe";
		int retornos3 = 27;
		Ex03Processos processo3 = new Ex03Processos(nomeProc3, retornos3);
		fila.insert(processo3);
		
		
		escalonador.escalonador(fila);
		
	}
}
