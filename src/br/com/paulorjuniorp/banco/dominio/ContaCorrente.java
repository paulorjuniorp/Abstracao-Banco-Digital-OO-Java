package br.com.paulorjuniorp.banco.dominio;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente");
        System.out.println(super.saldo);
    }
}
