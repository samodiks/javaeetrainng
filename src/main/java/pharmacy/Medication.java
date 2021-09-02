package pharmacy;

public abstract class Medication {
    private String prescription;

    public void givePrescription(String sickness)
    {
        //String prescription;
        if (sickness==null)
        {
            prescription="Patient is Healthy";
        } else if(sickness.contains("Malaria") )
        {
            prescription="Give Anti-malaria like AL and pain killers";
        }
        else if(sickness.contains("Corona"))
        {
            prescription="Take to quarantine and provide fruits and oxygen";
        }
        else if (sickness.contains("HIV"))
        {
            prescription="Admit to ARV plan";
        }
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
