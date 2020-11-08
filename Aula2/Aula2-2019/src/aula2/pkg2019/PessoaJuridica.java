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
public class PessoaJuridica extends Pessoa {
    String cnpj;
    
    @Override 
    public void exibirPessoa() {
            System.out.println("Razão Social: " + nome +
                    "\nTelefone: " + telefone +
                    "\nCPF: " + cnpj);
    }
}
