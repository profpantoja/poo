import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAttorney {
    
    @Test
    public void integrationTestTwoAttorneys() {
        
        // Junior Attorney

        String[] mockedNames = { 
            "Harvey Specter", 
            "Mike Ross" 
        };
        int[] mockedSalaries = { 5000, 15000 };
        String[] mockedDescriptions = {
            "Junior Attorney is an attorney with 1 year of experience.",
            "Senior Attorney is an attorney with 7+ years of experience."
        };

        Attorney attorney = new Attorney(
            mockedNames[0],
            mockedSalaries[0],
            1,
            mockedDescriptions[0]
        );

        // Senior Attorney

        Attorney attorney2 = new Attorney(
            mockedNames[1],
            mockedSalaries[1],
            1,
            mockedDescriptions[1]
        );

        // Law Firm

        String mockedFirmName = "Law Firm";
        LocalDate mockedFoundation = LocalDate.of(2020, 1, 1);
        String mockedInsuranceQuote = "Insurance Quote";
        String mockedGovApprovement = "Gov Approvement";


        Law law = new Law(
            mockedFirmName,
            mockedFoundation,
            mockedInsuranceQuote,
            mockedGovApprovement
        );
        
        // Test Law Firm with two attorneys
        // Add attorneys to law firm
        law.addAttorney(attorney);
        law.addAttorney(attorney2);

        assertEquals(mockedFirmName, law.getName());
        assertEquals(mockedFoundation, law.getFoundation());
        assertEquals(mockedInsuranceQuote, law.getInsuranceQuote());
        assertEquals(mockedGovApprovement, law.getGovApprovement());

        assertEquals(2, law.getAttorneys().size());

        assertEquals(mockedNames[0], law.getAttorneys().get(0).getName());
        assertEquals(mockedNames[1], law.getAttorneys().get(1).getName());

        assertEquals(mockedSalaries[0], law.getAttorneys().get(0).getSalary());
        assertEquals(mockedSalaries[1], law.getAttorneys().get(1).getSalary());

        assertEquals(mockedDescriptions[0], law.getAttorneys().get(0).getDescription());
        assertEquals(mockedDescriptions[1], law.getAttorneys().get(1).getDescription());

        // Remove attorney
        law.removeAttorney(attorney2);
        assertEquals(1, law.getAttorneys().size());

        assertEquals(mockedNames[0], law.getAttorneys().get(0).getName());
        assertEquals(mockedSalaries[0], law.getAttorneys().get(0).getSalary());
        assertEquals(mockedDescriptions[0], law.getAttorneys().get(0).getDescription());
        assertEquals(1, law.getAttorneys().get(0).getExperienceLevel());
    }

    @Test
    public void testAttorneyMethods() {

        Attorney attorney = new Attorney(
            "Pleno Attorney", 
            5000, 
            1, 
            "Pleno Attorney yeeeeey"
        );

        // Client: Pantoja
        attorney.representClients("Pantoja");
        attorney.research("Case of Pantoja");
        attorney.analysis("Contract for Pantoja"); 
        attorney.fileDocument("Contract");

        // Client: Vladimir
        attorney.representClients("Vladimir");
        attorney.research("Case of Vladimir");
        attorney.analysis("Contract for Vladimir"); 
        attorney.fileDocument("Contract");

        assertEquals("Name should be Pantoja",
        "Pantoja", attorney.getClients().get(0));

        assertEquals("Research should be Case of Pantoja",
        "Case of Pantoja", attorney.getResearchs().get(0));
        
        assertEquals("Clients size should be 2",
        2, attorney.getClients().size());
        
        assertEquals("Research size should be 2",
         2, attorney.getResearchs().size()
        );

        assertEquals("Docs size should be 2",
        2, attorney.getDocs().size()
       );

    }

}