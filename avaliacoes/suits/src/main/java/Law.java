import java.time.LocalDate;
import java.util.ArrayList;

public class Law extends Firm{

    private String insuranceQuote;
    private String govApprovement;
    private ArrayList<Attorney> attorneys = new ArrayList<Attorney>();

    
    
    public Law(String name, LocalDate foundation, String insuranceQuote, String govApprovement) {
        super(name, foundation);
        this.insuranceQuote = insuranceQuote;
        this.govApprovement = govApprovement;
    }
    
    public String info() {
        return "Law [name=" + getName() + ", foundation=" + getFoundation() + ", insuranceQuote=" + insuranceQuote + ", govApprovement=" + govApprovement + " " + listEmployees() + "]";
    }
    
    public String getInsuranceQuote() {
        return insuranceQuote;
    }
    
    public void setInsuranceQuote(String insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }
    
    public String getGovApprovement() {
        return govApprovement;
    }
    
    public void setGovApprovement(String govApprovement) {
        this.govApprovement = govApprovement;
    }

    public void addAttorney(Attorney attorney) {
        this.attorneys.add(attorney);
    }

    public void removeAttorney(Attorney attorney) {
        this.attorneys.remove(attorney);
    }

    public ArrayList<Attorney> getAttorneys() {
        return this.attorneys;
    }

    public void setAttorneys(ArrayList<Attorney> attorneys) {
        this.attorneys = attorneys;
    }
    
}
