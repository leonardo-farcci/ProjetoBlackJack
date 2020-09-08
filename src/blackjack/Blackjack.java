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
public class Blackjack {

    public static void main(String args[]) {
        Shoe s = new Shoe();
        s.tamanhoShoe();
        Jogador j = new Jogador();
        j.rodada();

    }
}
