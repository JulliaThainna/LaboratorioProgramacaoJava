import java.time.LocalTime;
import java.util.ArrayList;

public class Fila {
	ArrayList <Cliente> comum = new ArrayList<>();
	ArrayList <Cliente> preferencial = new ArrayList<>();
	int ultimo = 0, penultimo = 0;
	
	
	//Métodos
	
	//Adiciona um cliente novo na fila comum ou preferencial
	public void entraFila(String nome, LocalTime hora, int idade, String servico) {
		Cliente cliente = new Cliente(nome, hora, idade, servico);
		if(idade <= 65) {
			this.comum.add(cliente);
			return;
		}
		this.preferencial.add(cliente);
	}
	
	//Remove um cliente da fila comum ou preferencial
	public void desisteFila(String nome, int idade) {
		int tam = comum.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.comum.get(i);
			if(cliente.getNome().equals(nome)) {
					this.comum.remove(cliente);
			}
		}
	
		tam = preferencial.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.preferencial.get(i);
			if(cliente.getNome().equals(nome)) {
				this.preferencial.remove(cliente);
			}
		}
	}
	
	//Atende um cliente da fila comum ou preferencial (seguindo o padrão de atendimento)
	public void atendeCliente() {
		
		// 0 - comum
		// 1 - preferencial
		/*penultimo == 1 e ultimo == 1
		penultimo == 0 e ultimo == 0
		penultimo == 0 e ultimo == 1
		penultimo == 1 e ultimo == 0*/
		
		if(this.penultimo == 0 && this.ultimo == 0) {
			this.preferencial.remove(0);
			this.penultimo = this.ultimo;
			this.ultimo = 1;
		}
		else if(this.penultimo == 1 && this.ultimo == 1) {
			this.comum.remove(0);
			this.penultimo = this.ultimo;
			this.ultimo = 0;
		}
		else if(this.penultimo == 0 && this.ultimo == 1) {
			this.preferencial.remove(0);
			this.penultimo = this.ultimo;
			this.ultimo = 1;
		}
		else if(this.penultimo == 1 && this.ultimo == 0) {
			this.preferencial.remove(0);
			this.penultimo = this.ultimo;
			this.ultimo = 0;
		}
	}
	
	//Busca o cliente na fila comum ou preferencial e retorna seu lugar na mesma 
	public int buscaPosicaoFila(String nome) {
		int tam = comum.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.comum.get(i);
			if(cliente.getNome().equals(nome)) {
				return comum.indexOf(cliente);
			}
		}
	
		tam = preferencial.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.preferencial.get(i);
			if(cliente.getNome().equals(nome)) {
				return preferencial.indexOf(cliente);
			}
		}
		
		return -1;
	}
	
	//Imprime todos os clientes das filas comum e preferencial
	public void imprimeFila() {
		int tam = comum.size();
		
		System.out.println("Fila Comum");
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.comum.get(i);
			System.out.println("Nome: "+cliente.getNome());
		}
		
		System.out.println("Fila Preferencial");
		tam = preferencial.size();
		for(int i = 0; i < tam; i++) {
			Cliente cliente = this.preferencial.get(i);
			System.out.println("Nome: "+cliente.getNome());
		}
	}
	
}
