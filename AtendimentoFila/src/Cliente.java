import java.time.LocalTime;

public class Cliente {
	String nome;
	LocalTime hora;
	int idade;
	String servico;
	
	//Constructor da classe Cliente
	public Cliente(String nome, LocalTime hora, int idade, String servico) {
		if(!nome.matches("[a-zA-Z]+$")) {
			return;
		}
		if(idade < 0) {
			return;
		}
		
		this.nome = nome;
		this.hora = hora;
		this.idade = idade;
		this.servico = servico;
	}
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.matches("[a-zA-Z]+$")) {
			return;
		}
		this.nome = nome;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade < 0) {
			return;
		}
		this.idade = idade;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
}

