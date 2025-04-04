package ar.edu.unahur.gabrielledezma.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AtletaTest {
    private Atleta ana = new Atleta(25);
    private Atleta rosa = new Atleta(45, 8);
    private Atleta perla = new Atleta(28, 4, 6);

    @Test
    public void creacionAtleta(){
        assertEquals(Atleta.class, ana.getClass());
    }

    @Test
    public void creacionAtletaDe25Anios(){
        assertEquals(25, ana.getEdad());
    }

    @Test
    public void creacionAtletaDe45Anios8Tecnicas(){
        assertEquals(8, rosa.getCantTecnicas());
    }

    @Test
    public void creacionAtletaDe28Anios4TecnicasY6MasaMuscular(){
        assertEquals(6, perla.getMasaMuscular());
    }

    @Test
    public void potenciaDeAna(){
        assertEquals(28, ana.potencia());
    }

    @Test
    public void inteligenciaDeAna(){
        assertEquals(12, ana.inteligencia());
    }

    @Test
    public void esDestacadaAna(){
        assertTrue(ana.esDestacada());
    }

    @Test
    public void potenciaDeRosa(){
        assertEquals(52, rosa.potencia());
    }

    @Test
    public void inteligenciaDeRosa(){
        assertEquals(8, rosa.inteligencia());
    }

    @Test
    public void esDestacadaRosa(){
        assertTrue(rosa.esDestacada());
    }

    @Test
    public void potenciaDePerla(){
        assertEquals(44, perla.potencia());
    }

    @Test
    public void inteligenciaDePerla(){
        assertEquals(12, perla.inteligencia());
    }

    @Test
    public void esDestacadaPerla(){
        assertFalse(perla.esDestacada());
    }

    @Test
    public void perlaEntrena15DiasYAprendeUnaTecnica(){
        perla.entrenar(15);
        perla.aprenderTecnica();

        assertEquals(65, perla.potencia());
        assertFalse(perla.esDestacada());
    }

    @Test
    public void perlaEntrena15DiasYAprende2Tecnicas(){
        perla.entrenar(15);
        perla.aprenderTecnica();
        perla.aprenderTecnica();

        assertTrue(perla.esDestacada());
    }

    
}
