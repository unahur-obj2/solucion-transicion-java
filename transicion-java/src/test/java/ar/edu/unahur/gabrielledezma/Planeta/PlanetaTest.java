package ar.edu.unahur.gabrielledezma.Planeta;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.gabrielledezma.Persona.*;

public class PlanetaTest {
    private Persona julieta = new Persona(42);
    private Atleta ana = new Atleta(25);
    private Atleta rosa = new Atleta(45, 8);
    private Atleta perla = new Atleta(28, 4, 6);
    private Docente monica = new Docente(45, 6);
    private Docente luisa = new Docente(35, 1);
    private Planeta triton = new Planeta(List.of(julieta, ana, rosa, perla, monica, luisa), 2);

    @Test
    public void creacionPlanetaTriton(){
        assertEquals(Planeta.class,triton.getClass());
    }

    @Test
    public void delegacionDiplamaticaDeTriton(){
        assertEquals(List.of(ana, rosa, monica), triton.delegacionDiplamatica());
    }

    @Test
    public void valorInicialDeDefensaDeTriton(){
        assertEquals(2, triton.valorInicialDeDefensa());
    }

    @Test
    public void tritonEsCulto(){
        assertFalse(triton.esCulto());
    }

    @Test
    public void potenciaRealDeTriton(){
        assertEquals(184, triton.potenciaReal());
    }
}
