package br.com.paulorjuniorp.banco.dominio;

public abstract class Conta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public abstract void imprimirExtrato();

    public void sacar(double valor){
        if(saldo > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
