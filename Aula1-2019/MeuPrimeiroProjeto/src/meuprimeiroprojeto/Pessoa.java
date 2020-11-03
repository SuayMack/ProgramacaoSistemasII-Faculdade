/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuprimeiroprojeto;

/**
 *
 * @author Priscila
 */
public class Pessoa {
    String nome;
    int idade;
    String telefone;
    
    public Pessoa() {
        nome = " ";
        idade = 0;
        telefone = "123456";        
    }
    
    public Pessoa(String nome, int idade, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public Pessoa(Pessoa obj){
        this.nome = obj.nome;
        this.idade = obj.idade;
        this.telefone = obj.telefone;
    }
}
