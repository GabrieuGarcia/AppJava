package com.example.iossenac.appjava.model;

/**
 * Created by iossenac on 29/04/17.
 */

public class Conta {

    private String nome;
    private String agencia;
    private String numeroConta;
    private float saldo;
    private float limite;


    //Construtor - (pega todas as variaveis declaradas e seta no construtor) ----------------------

    public Conta(String nome, String agencia, String numeroConta, float limite){

        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.limite = limite;

    }


    //Construtor com o parametro saldo adicionado - (pega todas as variaveis declaradas e seta no construtor)

    public Conta(String nome, String agencia, String numeroConta, float limite, float saldo){

        this.nome = nome;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;

    }




    //metodo de deposito - (seta o saldo atual e adiciona ao valor) ------------------------------

    public void depositar(float valor) {

        this.saldo += valor;

    }





    //método para sacar - (seta o saldo atual e diminui do valor) --------------------------------

    public void sacar(float valor) throws Exception{

        if (this.saldo - valor + this.limite >= valor)

            this.saldo -= valor;

        System.out.println("ERRO!");

        throw new Exception("Saldo insuficiente para saque!");

    }




    //metodo de transferencia --------------------------

    public void transferir(Conta conta, float valor) {

        if (this.saldo + this.limite >= valor) {

        } else {
            System.out.println("ERRO!");

        }
    }

    public String getNome() {
        return nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
}
