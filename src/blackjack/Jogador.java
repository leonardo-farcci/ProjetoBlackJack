/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lab213
 */
public class Jogador {

    private int jogador = 0;
    private int pontosJogador = 0;
    private int casa = 0;
    private int pCasa = 0;

    Carta cartasJogador[] = new Carta[20];
    Carta cartasCasa[] = new Carta[20];
    Baralho b = new Baralho();
    Casa c = new Casa();
    Scanner entrada = new Scanner(System.in);
    private String resp = "";

    public void rodada() {
        b.embaralhar();
        do {
            cartasJogador[jogador++] = b.darCarta();
            System.out.println("\nSuas cartas são:");
            pontosJogador = mostraCartas(cartasJogador, jogador);
            System.out.println("Sua pontuação é de " + pontosJogador + " pontos");
            if (pontosJogador < 21) {
                System.out.println("Quer carta ou deseja parar? (HIT|PARAR)");
                resp = entrada.next();
            }

        } while (resp.equals("HIT") && pontosJogador < 21);
        if (pontosJogador > 21) {
            System.out.println("Passou de 21 pontos");
            
        }
        if (getResp().equals("PARAR") && pontosJogador < 21) {
            System.out.println("Você parou com " + pontosJogador + " pontos");
            cartasCasa[casa++] = b.darCarta();
            cartasCasa[casa++] = b.darCarta();
        }
        if (pontosJogador == 21) {
            System.out.println("Parabéns, você atingiu 21!");
        }
        while (pCasa < pontosJogador && pCasa != 21) {
            cartasCasa[casa++] = b.darCarta();
            System.out.println("\nA casa tem na mão nesta rodada:");
             pCasa = mostraCartas(cartasCasa, casa);
             System.out.println("Totalizando "+pCasa+" pontos");
             c.setPontosCasa(pCasa);
             c.setCasa(casa);
        }
        if (pCasa == 21){
            System.out.println("A casa ganhou!");
        }
        if (pCasa >= pontosJogador && pCasa <= 21) {
            System.out.println("\nVocê perdeu!");
        } else {
            System.out.println("\nVocê ganhou!");
        }

    }

    public int mostraCartas(Carta mao[], int quant) {
        int pontos = 0;
        for (int i = 0; i < quant; i++) {
            System.out.print(" " + mao[i].toString());
            if (mao[i].getValor() > 13) {
                pontos++;
            } else {
                pontos += mao[i].getValor();
            }
        }
        System.out.println();
        return pontos;
    }

    /**
     * @return the resp
     */
    public String getResp() {
        return resp;
    }

}
