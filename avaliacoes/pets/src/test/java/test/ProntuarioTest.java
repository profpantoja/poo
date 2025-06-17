package test;

import static org.junit.Assert.*;
import org.junit.Test;
import pets.*;

public class ProntuarioTest {

    @Test
    public void testRealizarConsultaSetsVetAndPet() {
        Veterinario vet = new Veterinario("Dr. Silva", "Silva");
        Pet pet = new Cachorro("Rex", "2020-01-01");
        Prontuario pront = new Prontuario();
        pront.realizarConsulta(vet, pet);
        assertEquals(vet, pront.getVeterinario());
        assertEquals(pet, pront.getPet());
    }

    @Test
    public void testGetInfoFormatted() {
        Veterinario vet = new Veterinario("Dr. Souza", "Souza", "CRV456");
        Pet pet = new Gato("Mimi", "2021-05-05");
        Prontuario pront = new Prontuario("2023-10-01", "Annual Checkup");
        pront.setVeterinario(vet);
        pront.setPet(pet);
        String info = pront.getInfo();
        assertTrue(info.contains("Data: 2023-10-01"));
        assertTrue(info.contains("Comentario: Annual Checkup"));
        assertTrue(info.contains("Veterinário: Nome: Dr. Souza, Apelido: Souza, CRV: CRV456"));
        assertTrue(info.contains("Pet: Gato: Mimi, Nascimento: 2021-05-05"));
    }
}