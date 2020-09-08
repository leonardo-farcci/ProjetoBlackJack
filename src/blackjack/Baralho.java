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
public class Baralho {

    private Carta monte[];
    private int topo;
    

    public Baralho() {
        monte = new Carta[52];
        topo = 0;
        for (int n = 1; n < 5; n++) {
            for (int v = 1; v < 14; v++) {
                monte[topo++] = new Carta(n, v);
            }
        }
    }

    public boolean temCarta() {
        return topo > 0;
    }

    public Carta darCarta() {
        Carta tmp = null;
        if (topo > 0) {
            tmp = monte[--topo];
        }
        return tmp;
    }

    public void embaralhar() {
        for (int c = 0; c < 52; c++) {
            int i = (int) Math.round(Math.random() * 51);
            Carta tmp = monte[i];
            monte[i] = monte[c];
            monte[c] = tmp;
        }
    }
}
