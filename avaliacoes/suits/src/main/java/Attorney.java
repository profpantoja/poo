import java.util.ArrayList;

import interfaces.I_Lawyer;

public class Attorney extends TypeJob implements I_Lawyer {

    private ArrayList<String> docs = new ArrayList<String>();
    private ArrayList<String> clients = new ArrayList<String>();
    private ArrayList<String> researchs = new ArrayList<String>();

    public Attorney() {
        super();
    }
    
    public Attorney(String name, int salary, int experienceLevel, String description) {
        super(
            name,
            "Lawyer",
            description,
            salary, 
            experienceLevel
        );            
    }
        
        @Override
        public void representClients(String client) {
            clients.add(client);
            System.out.println("represent client " + client);
        }
        
        @Override
        public void research(String research) {
            researchs.add(research);
            System.out.println("research " + research);
        }
        
        @Override
        public void analysis(String doc) {
            docs.add(doc);
            System.out.println("analysing " + doc);
        }
        
        @Override
        public void fileDocument(String type) {
            System.out.println("file Document is" + type);
        }

        public ArrayList<String> getDocs() {
            return this.docs;
        }
    
        public void setDocs(ArrayList<String> docs) {
            this.docs = docs;
        }
    
        public ArrayList<String> getClients() {
            return this.clients;
        }
    
        public void setClients(ArrayList<String> clients) {
            this.clients = clients;
        }
    
        public ArrayList<String> getResearchs() {
            return this.researchs;
        }
    
        public void setResearchs(ArrayList<String> researchs) {
            this.researchs = researchs;
        }
        
        
        
    }
