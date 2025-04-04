package ar.edu.unahur.gabrielledezma.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.gabrielledezma.Arma.Espadon;
import ar.edu.unahur.gabrielledezma.Arma.Pistolete;

public class SoldadoTest {
    private Pistolete pistola = new Pistolete(10);
    private Espadon espada = new Espadon(5);
    private Soldado jorge = new Soldado(60,List.of(pistola, espada));

    @Test
    public void creacionSoldado(){
        assertEquals(Soldado.class, jorge.getClass());
    }

    @Test
    public void potenciaSoldado(){
        assertEquals(20 + 6 + 30, jorge.potencia());
    }
}
