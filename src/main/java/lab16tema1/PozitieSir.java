package lab16tema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PozitieSir implements Runnable {
    static List<Integer> listPoz = new ArrayList<>();
    static int nrCautat = 23;
    static int MAXLENGTH = 11;
    static int[] sir = {11,23,4,7,2,23,4,45,11,4,23};

    private int[] sirInt;
   // private int nrCautat;
    private int iDecal;


    public PozitieSir(int[] sirInt, int iDecal) {
        this.sirInt = sirInt;
        this.iDecal = iDecal;
    }

    public int[] getSirInt() {
        return sirInt;
    }

    public int getiDecal() {
        return iDecal;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sir));

        int[] sir1 = new int[MAXLENGTH/2];
        int[] sir2 = new int[MAXLENGTH-MAXLENGTH/2];

        System.arraycopy(sir, 0, sir1, 0,MAXLENGTH/2);
        System.arraycopy(sir, MAXLENGTH/2, sir2, 0,MAXLENGTH-MAXLENGTH/2);

        PozitieSir sirC1 = new PozitieSir(sir1,0);
        PozitieSir sirC2 = new PozitieSir(sir2,MAXLENGTH/2);

        sirC1.gasestePoz();
        sirC2.gasestePoz();

        System.out.println("Numarul " + nrCautat + " este pe pozitiile " + listPoz);
    }
    public void gasestePoz() {
        Thread t = new Thread(this);
        t.start();

    }

    public void run() {
        List<Integer> listNrPoz = new ArrayList<>();
        for (int i=0; i<sirInt.length; i++) {
            if (sirInt[i] == nrCautat) {
                listPoz.add(i+iDecal);
            }
        }
        System.out.println("Acesta este un thread");
    }
}
