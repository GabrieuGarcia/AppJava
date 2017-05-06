package com.example.iossenac.appjava.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iossenac on 29/04/17.
 */
public class ContaTest {

    @Test //metodo de deposito com sucesso ----------------------------

    public void depositarSucesso(){

        float valorEsperado = 300;

        float valorDepositado = 300;

        Conta conta = new Conta("A","a","a",100);
        conta.depositar(valorDepositado);

        conta.depositar(300);

        assertEquals(valorEsperado, conta.getSaldo(),0);

    }


    @Test // metodo de saque com sucesso -----------------------------

    public void sacarSucesso(){

        float valorEsperado = 100;

        float valorSacado = 100;

        Conta conta = new Conta("a","a","a",200,100);

        try {
            conta.sacar(valorSacado);
        } catch (Exception e){
            fail(e.getMessage());
        }

        assertEquals(valorEsperado, conta.getSaldo());

    }

    @Test
    public void sacarSErroSaldoInsuficiente(){

    }

    @Test
    public void transferir(){

    }

    @Test
    public void transferirSucesso(){

    }

    @Test
    public void transferirErroSaldoInsuficiente(){

    }

}