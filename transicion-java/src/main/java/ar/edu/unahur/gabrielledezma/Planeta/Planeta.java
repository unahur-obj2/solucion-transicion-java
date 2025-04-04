package ar.edu.unahur.gabrielledezma.Planeta;

import java.util.List;

import ar.edu.unahur.gabrielledezma.Persona.Atleta;
import ar.edu.unahur.gabrielledezma.Persona.Docente;
import ar.edu.unahur.gabrielledezma.Persona.Persona;

public class Planeta {
    private List<Persona> habitantes;
    private Integer museos;

    
    public Planeta(List<Persona> habitantes, Integer museos){
        this.habitantes = habitantes;
        this.museos = museos;
    }

    public List<Persona> getHabitantes(){
        return habitantes;
    }
    
    public List<Persona> delegacionDiplamatica(){
        return habitantes.stream()
            .filter(habitante -> habitante.esDestacada())
            .toList();
    }
    
    public Integer valorInicialDeDefensa(){
        return habitantes.stream()
            .filter(habitante -> habitante.potencia() >= 30)
            .toList()
            .size();
    }
    

    public Boolean esCulto(){
        return museos >= 2 && habitantes.stream()
                                .allMatch(habitante -> habitante.inteligencia() >= 10);
    }

    public Integer potenciaReal(){
        return habitantes.stream()
            .mapToInt(habitante -> habitante.potencia())
            .sum();
    }
    
    public Integer potenciaReal2(){
        var sumatorias = 0;
        for (Persona h : habitantes) {
            sumatorias += h.potencia();
        }
        return sumatorias;
    }

    // Mas sobre el planeta
    
    private Integer longitudMuralla;

    public void construirMuralla(Integer kilometros){
        this.longitudMuralla += kilometros;
    }

    public void fundarMuseo(){
        this.museos += 1;
    }

    public Integer getLongitudMuralla(){
        return longitudMuralla;
    }

    public Integer getMuseos(){
        return museos;
    }

    public Integer potenciaAparente(){
        var potencias = habitantes.stream()
        .mapToInt(habitante -> habitante.potencia())
        .max();
        return potencias.isPresent() ? potencias.getAsInt() * habitantes.size() : 0;
    }

    public Boolean necesitaReforzarse(){
        return this.potenciaAparente() >= this.potenciaReal() * 2;
    }

    public void recibirTributos(){
        for (Persona h : habitantes) {
            if(h.getClass() == Docente.class){
                fundarMuseo();
            }else if(h.getClass() == Atleta.class){
                construirMuralla(2);
            } 
        }
    }
}
