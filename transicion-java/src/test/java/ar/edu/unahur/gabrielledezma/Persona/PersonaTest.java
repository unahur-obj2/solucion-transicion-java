package ar.edu.unahur.gabrielledezma.Persona;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {
    private Persona julieta = new Persona(42);
    
    @Test
    public void creacionPersonaGenerica(){        
        assertEquals(Persona.class, julieta.getClass());
    }

    @Test
    public void creacionPersonaGenericaDe42Anios(){        
        assertEquals(42, julieta.getEdad());
    }

    @Test
    public void potenciaDeJulieta(){
        assertEquals(20, julieta.potencia());
    }

    @Test
    public void inteligenciaDeJulieta(){
        assertEquals(8, julieta.inteligencia());
    }

    @Test
    public void esDestacadaJulieta(){
        assertFalse(julieta.esDestacada());
    }  
}