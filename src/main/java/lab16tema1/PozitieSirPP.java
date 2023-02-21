package lab16tema1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PozitieSirPP {
    public static void main(String[] args) {
        int MAXLENGTH = 11;
        int[] sir = {11,23,4,7,2,23,4,45,11,4,23};
        int nrCautat = 4;

        System.out.println(Arrays.toString(sir));
        System.out.println("Numarul de cautat: " + nrCautat);

        int[] sir1 = new int[MAXLENGTH/2];
        int[] sir2 = new int[MAXLENGTH-MAXLENGTH/2];

        //List listNrPoz = new ArrayList<>();

        System.arraycopy(sir, 0, sir1, 0,MAXLENGTH/2);
        System.arraycopy(sir, MAXLENGTH/2, sir2, 0,MAXLENGTH-MAXLENGTH/2);

        PozitieSir sirC1 = new PozitieSir(sir1, nrCautat);
        PozitieSir sirC2 = new PozitieSir(sir2, nrCautat);

        sirC1.gasestePoz();
        sirC2.gasestePoz();

        //System.out.println("Numarul " + nrCautat + " este pe pozitiile " + listNrPoz);
    }
}
