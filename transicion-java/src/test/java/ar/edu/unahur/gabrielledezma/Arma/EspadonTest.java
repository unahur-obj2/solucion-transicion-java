package ar.edu.unahur.gabrielledezma.Arma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.gabrielledezma.Persona.Soldado;

public class EspadonTest {
    private Espadon espada = new Espadon(5);
    private Soldado jorge = new Soldado(60,List.of(espada));

    @Test
    public void creacionEspadon(){
        assertEquals(Espadon.class, espada.getClass());
    }

    @Test
    public void potenciaEspadon(){
        assertEquals(6, espada.potencia(jorge));
    }
}
