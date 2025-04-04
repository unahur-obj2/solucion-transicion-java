package ar.edu.unahur.gabrielledezma.Persona;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.gabrielledezma.Arma.Espadon;
import ar.edu.unahur.gabrielledezma.Arma.Pistolete;
import ar.edu.unahur.gabrielledezma.Planeta.Planeta;

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

    @Test
    public void ofreceTributoSoldado(){
        Planeta p = new Planeta(List.of(jorge));
        jorge.ofrecerTributo(p);
        assertEquals(5, p.getLongitudMuralla());
    }
}
