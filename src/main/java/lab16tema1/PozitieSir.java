package lab16tema1;

import java.util.ArrayList;
import java.util.List;

public class PozitieSir implements Runnable {
    private int[] sirInt;
//    private int pozInc;
//    private int pozSf;
    private int nrCautat;
    //private int MAXLENGTH = 11;


    public PozitieSir(int[] sirInt, int nrCautat) {
        this.sirInt = sirInt;
        this.nrCautat = nrCautat;
    }

    public int[] getSirInt() {
        return sirInt;
    }

    public int getNrCautat() {
        return nrCautat;
    }

    public void gasestePoz() {
        Thread t = new Thread(this);
        t.start();

    }

    public void run() {
        int lungSirPoz = 0;
        List<Integer> listNrPoz = new ArrayList<>();
        for (int i=0; i<this.getSirInt().length; i++) {
            if (sirInt[i] == this.nrCautat) {
                listNrPoz.add(i);
            }
        }
        System.out.println(listNrPoz);
    }
}
