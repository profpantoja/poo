import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testLaw {
    
    @Test
    public void testLawMethods() {

        String mockedName = "Law Firm";
        LocalDate mockedFoundation = LocalDate.of(2020, 1, 1);
        String mockedInsuranceQuote = "Insurance Quote";
        String mockedGovApprovement = "Gov Approvement";

        Law law = new Law(
            mockedName, 
            mockedFoundation, 
            mockedInsuranceQuote, 
            mockedGovApprovement
        );
        
        // Test law getters and setters
        assertEquals(mockedName, law.getName());
        assertEquals(mockedFoundation, law.getFoundation());
        assertEquals(mockedInsuranceQuote, law.getInsuranceQuote());
        assertEquals(mockedGovApprovement, law.getGovApprovement());
                
        // Add employees
        ArrayList<Person> employees = law.getEmployeers();

        employees.add(new Person(
            "Carlos",
            "Pantoja",
            "Male"
        ));
        
        // Add employees
        employees.add(new Person(
            "Vladimir",
            "Erthal",
            "Male"
        ));
        
        
        // Test employees
        assertEquals(law.getEmployeers().size(), 2);
        assertEquals(law.getEmployeers().get(0).getName(), "Carlos");
        assertEquals(law.getEmployeers().get(0).getSurname(), "Pantoja");
        assertEquals(law.getEmployeers().get(0).getGender(), "Male");

        assertEquals(law.getEmployeers().get(1).getName(), "Vladimir");
        assertEquals(law.getEmployeers().get(1).getSurname(), "Erthal");
        assertEquals(law.getEmployeers().get(1).getGender(), "Male");

        // Test info method
        String expectedInfo = String.format(
            "Law [name=%s, foundation=%s, insuranceQuote=%s, govApprovement=%s Empregados: %s,%s,.]",
            mockedName,
            mockedFoundation,
            mockedInsuranceQuote,
            mockedGovApprovement,
            law.getEmployeers().get(0).getName(),
            law.getEmployeers().get(1).getName()
        );

        assertEquals(expectedInfo, law.info());
    }

}
