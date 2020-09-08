/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author lab213
 */
public class Shoe {

    private int tamanho;
    

    public int tamanhoShoe() {
        
        int resposta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o tamanho do shoe que deseja jogar? ");
        resposta = entrada.nextInt();
        if (resposta <= 8){
            System.out.println(resposta+" é o tamanho escolhido");
            resposta = tamanho;
        }else{
            System.out.println("Tamanho não apropriado, escolha um número de 1 à 8.");
        }
        return tamanho;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
   

}
