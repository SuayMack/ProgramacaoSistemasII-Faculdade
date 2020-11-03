/*** Atividade 1 - Programação de Sistemas II
    @author Priscila Chueryz dos Santos 
    R. A.: 1821518-5
/* 
Um dos recursos essenciais dos programas de computador não triviais é a 
* capacidade de decidir e executar ações diferentes, dependendo da natureza dos
* dados de entrada. Dentre as várias formas de decisão, a instrução if permite
* que um programa execute ações diferentes dependendo do resultado de uma 
* condição (HORSTMANN, 2006).
Dados os conhecimentos sobre as rotinas de decisão na linguagem Java escreva
* um trecho (como se estivesse dentro da função main – ou seja ignore as
* declarações de classe e importações) que leia um valor de entrada como 
* sendo a idade do usuário e informe qual a situação eleitoral do mesmo 
* da seguinte forma:
- Dos 0 aos 16 anos, o usuário é proibido de votar
- Dos 16 aos 18 e com mais de 60 o voto é opcional (facultativo)
- Dos 18 aos 60 o voto é obrigatório
- Valores menores que 0 e maiores que 150 são considerados inválidos.
Utilize as rotinas de decisão if, else – if, else para a implementação das
* rotinas de decisão. Utilize os métodos da classe System para ações de 
* entrada e saída.
*/
package atividade1.voto;

import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class Atividade1Voto {

    public static void main(String[] args) {
        int idadeInt;
        Scanner scan = new Scanner(System.in);
        System.out.println ("Digite sua Idade: ");
        String idade = scan.nextLine();
        idadeInt = Integer.parseInt(idade);
        
        //- Dos 0 aos 16 anos, o usuário é proibido de votar
        if(idadeInt < 16){
            System.out.println ("Situação eleitoral:\nProibido de votar.");
        }else if(idadeInt >= 16 && idadeInt < 18 || idadeInt > 60){//Dos 16 aos 18 e com mais de 60 o voto é opcional (facultativo)
            System.out.println ("Situação eleitoral:\nVoto Facultativo.");
        }else if(idadeInt >= 18 && idadeInt <= 60){//- Dos 18 aos 60 o voto é obrigatório
            System.out.println ("Situação eleitoral:\nVoto obrigatório.");
        }else{//- Valores menores que 0 e maiores que 150 são considerados inválidos.
            System.out.println ("Valor inválido");
        }        
    }   
}
