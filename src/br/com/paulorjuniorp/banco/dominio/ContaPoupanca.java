package br.com.paulorjuniorp.banco.dominio;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança");
        System.out.println(super.saldo);
    }
}
