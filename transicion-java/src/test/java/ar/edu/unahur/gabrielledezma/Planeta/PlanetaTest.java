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
    private Planeta triton = new Planeta(List.of(julieta, ana, rosa, perla, monica, luisa));

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

    @Test
    public void construir10kmMurallas(){
        triton.construirMuralla(10);
        assertEquals(10, triton.getLongitudMuralla());
    }

    @Test
    public void fundarUnMuseo(){
        triton.fundarMuseo();
        assertEquals(1, triton.getCantMuseos());
    }

    @Test
    public void potenciaAparenteDeTriton(){
        var habitanteMasPotente = triton.getHabitantes()
            .stream()
            .max((h1, h2) -> h1.potencia() - h2.potencia())
            .get();
        var potenciaAparente = habitanteMasPotente.potencia() * triton.getHabitantes().size();
        assertEquals(potenciaAparente, triton.potenciaAparente());
    }

    @Test
    public void tritonNecesitaReforzarse(){    
        assertFalse(triton.necesitaReforzarse());
    }

    @Test
    public void habitantesValiososDeTriton(){
        assertEquals(List.of(ana, rosa, perla, monica), triton.habitantesValiosos()); //valores: ana 40, rosa 60, perla 56, monica 40+5. julieta 28 luisa 34+5
    }

    @Test
    public void apaciguarOtroPlanetaPaleas(){
        Planeta paleas = new Planeta(List.of(rosa, perla));
        triton.apaciguarOtroPlaneta(paleas); //solo los valiosos ofrecen tributo
        assertEquals(6, paleas.getLongitudMuralla()); // 3 atletas construyrn 2km c/u
        assertEquals(1, paleas.getCantMuseos()); // 1 docente funda 1 museo 
    }
}
