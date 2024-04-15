package model;

public class Ex05Pessoa {

	String nome;
	int idade;
	float altura;

	public Ex05Pessoa(String nome, int idade, float altura) {

		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Ex05Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public float getAltura() {
		return altura;
	}

}
