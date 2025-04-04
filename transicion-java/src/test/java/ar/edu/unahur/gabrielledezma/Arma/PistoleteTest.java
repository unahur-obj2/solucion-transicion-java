package ar.edu.unahur.gabrielledezma.Arma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.gabrielledezma.Persona.Soldado;

public class PistoleteTest {
    private Pistolete pistola = new Pistolete(10);
    private Soldado jorge = new Soldado(60,List.of(pistola));

    @Test
    public void creacionPistolete(){
        assertEquals(Pistolete.class, pistola.getClass());
    }

    @Test
    public void potenciaPistolete(){
        assertEquals(30, pistola.potencia(jorge));
    }
}
