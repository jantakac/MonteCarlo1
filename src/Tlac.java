import OSPRNG.TriangularRNG;
import OSPRNG.UniformContinuousRNG;

import java.util.ArrayList;

public class Tlac {
    private static final double PLATI_TLACIARNAM = 0.15;
    private static final double DOBA_MEDZI_PREDAJOM = 2.7;
    private static final int POCET_KUSOV_BALIK = 10;


    public Tlac(int pocetReplikacii) {
        long zarobkySpocitaneVIteracii = 0;
        double priemerZarobkovVIteracii = (double) zarobkySpocitaneVIteracii / pocetReplikacii;

    }

    public void vykonajReplikaciu() {
        TriangularRNG triangularRNG = new TriangularRNG(0.25, 0.6, 0.95);
        UniformContinuousRNG uniformDiscreteRNG = new UniformContinuousRNG(250.0, 420.0);
        double cenaNovin = triangularRNG.sample();
        double casPredaja = uniformDiscreteRNG.sample();

    }
}
