package pharmacy;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Sickness sickness = new Sickness("Malaria");
        List<Medication> medicationList = new ArrayList<Medication>();
        Medication malaria = new Sickness("Malaria");
        medicationList.add(malaria);
        Medication hiv = new Sickness("HIV");
        medicationList.add(hiv);
        Medication corona = new Sickness("Corona");
        medicationList.add(corona);
        Medication nothing = new Sickness(null);
        medicationList.add(nothing);

        System.out.println();
        System.out.println("Malaria: "+medicationList.get(0).getPrescription());
        System.out.println("HIV: "+medicationList.get(1).getPrescription());
        System.out.println("corona: "+medicationList.get(2).getPrescription());

        System.out.println(sickness.getDescription());
        System.out.println();
    }
}
