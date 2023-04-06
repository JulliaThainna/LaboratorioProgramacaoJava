import java.util.ArrayList;
import java.math.BigDecimal;

public class Bomba {
    int id;
    ArrayList <String> nomes = new ArrayList<>();
    ArrayList <Double> precos = new ArrayList<>();

    //Constructor da classe Bomba
    public Bomba(int id) {
        if(id < 0) {
            return;
        }
        this.id = id;
    }
    
    
    //Setters e Getters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if(id < 0) {
            return;
        }
        this.id = id;
    }
    
    //Métodos

    //Cadastra um novo combustível para a bomba
    public void cadastraCombustivel(String nome, double preco) {
        this.nomes.add(nome);
        this.precos.add(preco);
    }

    //Abastece uma quantidade em litros
    public String abasteceQuantidadeLitros(String combustivel, double qtdLitro) {
        int indice = this.nomes.indexOf(combustivel); //encontra o valor do index do combustivel que o usuario deseja na arraylist
        BigDecimal preco = new BigDecimal(this.precos.get(indice)); //pega o conteudo do preco do index encontrado e o transforma em BigDecimal
        BigDecimal qtdLitros = new BigDecimal(qtdLitro); //transforma a qtd de litros passada para o método em BidDecimal
        BigDecimal valor = qtdLitros.multiply(preco); //qtdLitros * preco e salva na variavel valor
        return valor.toString(); //retorna valor em forma de String
    }

    //Abastece uma quantidade em dinheiro
    public String abasteceQuantidadeDinheiro(String combustivel, double valor) {
    	int indice = this.nomes.indexOf(combustivel);
    	BigDecimal precoLitro = new BigDecimal(this.precos.get(indice));
    	BigDecimal dinheiro = new BigDecimal(valor);
    	BigDecimal litros = dinheiro.divide(precoLitro);
    	return litros.toString();
    }
}