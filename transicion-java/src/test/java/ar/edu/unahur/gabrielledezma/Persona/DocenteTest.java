package ar.edu.unahur.gabrielledezma.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DocenteTest {
    private Docente monica = new Docente(45, 6);
    private Docente luisa = new Docente(35, 1);

    @Test
    public void creacionDocente(){
        assertEquals(Docente.class, monica.getClass());
    }

    @Test
    public void creacionDocenteDe45Anios(){
        assertEquals(45, monica.getEdad());
    }

    @Test
    public void creacionDocenteDe35Anios1Curso(){ 
        assertEquals(1, luisa.getCursosDados());
    }

    @Test
    public void potenciaDeMonica(){
        assertEquals(20, monica.potencia());
    }

    @Test
    public void inteligenciaDeMonica(){
        assertEquals(20, monica.inteligencia());
    }

    @Test
    public void esDestacadaMonica(){
        assertTrue(monica.esDestacada());
    }

    @Test
    public void potenciaDeLuisa(){
        assertEquals(20, luisa.potencia());
    }

    @Test
    public void inteligenciaDeLuisa(){
        assertEquals(14, luisa.inteligencia());
    }

    @Test
    public void esDestacadaLuisa(){
        assertFalse(luisa.esDestacada());
    } 
}
