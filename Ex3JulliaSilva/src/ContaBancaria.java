import java.math.BigDecimal;

public interface ContaBancaria {
	void sacar(BigDecimal valorSaque);
	void depositar(BigDecimal valorDeposito);
}
