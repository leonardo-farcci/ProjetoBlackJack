/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


/**
 *
 * @author lab213
 */
public class Carta {

    public static final int PAUS = 1;
    public static final int OUROS = 2;
    public static final int ESPADAS = 3;
    public static final int COPAS = 4;
    private int naipe;
    private int valor;

    public Carta(int n, int v) {
        if (n >= PAUS && n <= COPAS) {
            naipe = n;
        } else {
            naipe = 1;
        }
        if (v >= 1 && n <= 13) {
            valor = v;
        } else {
            valor = 1;
        }
    }

    

    

    public String toString() {
        String tmp = new String("");
        switch (valor) {
            case 1:
                tmp = "Às";
                break;
            case 2:
                tmp = "Dois";
                break;
            case 3:
                tmp = "Tres";
                break;
            case 4:
                tmp = "Quatro";
                break;
            case 5:
                tmp = "Cinco";
                break;
            case 6:
                tmp = "Seis";
                break;
            case 7:
                tmp = "Sete";
                break;
            case 8:
                tmp = "Oito";
                break;
            case 9:
                tmp = "Nove";
                break;
            case 10:
                tmp = "Dez";
                break;
            case 11:
                tmp = "Valete";
                break;
            case 12:
                tmp = "Dama";
                break;
            case 13:
                tmp = "Rei";
                break;
        }
        switch (naipe) {
            case PAUS:
                tmp = tmp + " de Paus";
                break;
            case OUROS:
                tmp = tmp + " de Ouros";
                break;
            case ESPADAS:
                tmp = tmp + " de Espadas";
                break;
            case COPAS:
                tmp = tmp + " de Copas";
                break;
        }
        return tmp;
    }
    public int getValor() {
        return valor;
    }
}


