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
public class MeuPrimeiroProjeto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa();
        p.nome = "João";
        p.idade = 28;
        
        /*
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Telefone: " + p.telefone);
        */
        Pessoa p2 = new Pessoa("Marcos", 65, "456789");
        /*
        System.out.println("\nNome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("Telefone: " + p2.telefone);
        */
        Pessoa p3 = new Pessoa(p);
        Pessoa p4 = p;
        /*
        System.out.println("\nNome: " + p3.nome);
        System.out.println("Idade: " + p3.idade);
        System.out.println("Telefone: " + p3.telefone);
        */
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        p4.nome = "Asdrubal";
        System.out.println("\nNome: " + p.nome);
        
        
    }
    
}
