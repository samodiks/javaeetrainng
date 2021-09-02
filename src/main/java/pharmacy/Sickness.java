package pharmacy;

public class Sickness extends Medication{
   // private String sickness;
    private String description;

    public Sickness(String description) {
        this.description = description;
        super.givePrescription(this.description);
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
