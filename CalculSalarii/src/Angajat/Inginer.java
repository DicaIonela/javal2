package Angajat;

public class Inginer extends Persoana implements IAngajat {
    private static final double coeficientSalarial=1.5;
    private int nrOreLucrate;

    public Inginer(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void setNrOreLucrate(int nrOreLucrate) {
        if (nrOreLucrate>250)
        {
            throw new IllegalArgumentException("Inginerii nu pot lucra mai mult de 250 ore pe luna.");
        }
        this.nrOreLucrate=nrOreLucrate;

    }

    @Override
    public double salariu() {
        return salariuOrarMinim*coeficientSalarial*nrOreLucrate;
    }

    @Override
    public String toString() {
        return "\nInginer:" +
                super.toString() +
                ",a lucrat "+nrOreLucrate+" ore,"+
                "\nsalariu="+salariu();
    }
}
