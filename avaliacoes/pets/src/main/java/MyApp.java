import model.Cachorro;
import model.Calopsita;
import model.Prontuario;
import model.Tutor;
import model.Veterinario;

public class MyApp {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // instanciando os tutores
        Tutor tutor1 = new Tutor("Ana", "Aninha");
        Tutor tutor2 = new Tutor("Carlos", "Carlão da massa");

        // instansiando os Veterinários
        Veterinario vet1 = new Veterinario("Dr. José", "Zé", "CRV123");
        Veterinario vet2 = new Veterinario("Dra. Karen", "Kaká", "CRV456");

        // Instanciando os Pets
        Cachorro kate = new Cachorro("Kate", "08/09/2018");
        Calopsita bob = new Calopsita("Bob", "10/01/2024");

        // faz a adoção
        tutor1.adotar(kate);
        tutor2.adotar(bob);

        // cria o prontuario para fazer a consulta
        Prontuario prontuario = new Prontuario("16/12/2024", "Consulta de rotina");

        // faz a consulta
        prontuario.realizarConsulta(vet1, bob);

        // Exibir informações
        System.out.println("\n" + tutor1.getInfo() + "\n");
        System.out.println(tutor2.getInfo());
        System.out.println(prontuario.getInfo() + "\n");

        // Chamar métodos específicos de cada pet
        kate.latir();
        bob.piar();
    }
}