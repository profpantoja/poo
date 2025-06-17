package test;

import static org.junit.Assert.*;
import org.junit.Test;
import pets.*;

public class TutorTest {

    @Test
    public void testAdotarAddsPet() {
        Tutor tutor = new Tutor("Ana", "Anna");
        Pet dog = new Cachorro("Rex", "2020-01-01");
        tutor.adotar(dog);
        assertTrue(tutor.getPets().contains(dog));
    }

    @Test
    public void testGetInfoIncludesPets() {
        Tutor tutor = new Tutor("Carlos", "Carl");
        Pet dog = new Cachorro("Rex", "2020-01-01");
        Pet cat = new Gato("Mimi", "2021-05-05");
        tutor.adotar(dog);
        tutor.adotar(cat);
        String info = tutor.getInfo();
        assertTrue(info.contains("Cachorro: Rex, Nascimento: 2020-01-01"));
        assertTrue(info.contains("Gato: Mimi, Nascimento: 2021-05-05"));
    }
}