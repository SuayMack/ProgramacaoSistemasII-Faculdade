/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.pkg2019;

/**
 *
 * @author Priscila
 */
public class Aula22019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa.exibirPessoa();
        
        PessoaFisica f = new PessoaFisica();
        f.nome = "Priscila";
        f.cpf = "55215478";        
        
        PessoaJuridica j = new PessoaJuridica();
        j.cnpj = "112457889985";
        
        System.out.println(f.nome + " " + f.cpf + "\n " + j.cnpj);
        
        Laser imp1 = new Laser();
        JatoDeTinta imp2 = new JatoDeTinta();
        
        imp1.imprimir();
        imp2.imprimir();
    }
    
}
