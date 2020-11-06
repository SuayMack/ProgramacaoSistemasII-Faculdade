/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Priscila
 */
class Conta {
    double saldo;
    int numeroConta;
    
    void sacar(double valor){
        this.saldo = this.saldo - valor;
    }
    
    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    /*public Conta(double saldo, int numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }*/
    
    
}
