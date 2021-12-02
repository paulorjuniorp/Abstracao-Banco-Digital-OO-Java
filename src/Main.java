import br.com.paulorjuniorp.banco.dominio.Conta;
import br.com.paulorjuniorp.banco.dominio.ContaCorrente;
import br.com.paulorjuniorp.banco.dominio.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        conta.setSaldo(500);

        Conta conta1 = new ContaPoupanca();
        conta1.setSaldo(200);

        System.out.println(conta);
        System.out.println(conta1);
    }
}
