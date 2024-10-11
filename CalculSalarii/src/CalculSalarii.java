// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Angajat.Inginer;
import Angajat.Sofer;
public class CalculSalarii {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Inginer inginer1=new Inginer ("Popescu","Ion");
        Inginer inginer2=new Inginer("Barbu","Andrei");
        Sofer sofer1=new Sofer("Ciocan","Rares");
        Sofer sofer2= new Sofer("Bolovan","Alex");
        inginer1.setNrOreLucrate(100);
        inginer2.setNrOreLucrate(200);
        sofer1.setKmParcursi(1000);
        sofer1.setNrOreLucrate(250);
        double TotalSalarii=inginer1.salariu()+ inginer2.salariu()+ sofer1.salariu();
        System.out.printf(inginer1.toString());
        System.out.printf(inginer2.toString());
        System.out.printf(sofer1.toString());
        System.out.printf("\nTotal salarii= "+TotalSalarii);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}