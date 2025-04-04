package ar.edu.unahur.gabrielledezma.Planeta;

import java.util.List;

import ar.edu.unahur.gabrielledezma.Persona.Persona;

public class Planeta {
    private List<Persona> habitantes;
    private Integer cantMuseos = 0;
    // Mas sobre el planeta
    private Integer longitudMuralla = 0;

    public Planeta(List<Persona> habitantes){
        this.habitantes = habitantes;
    }

    public Planeta(List<Persona> habitantes, Integer cantMuseos){
        this.habitantes = habitantes;
        this.cantMuseos = cantMuseos;
    }

    public Planeta(List<Persona> habitantes, Integer cantMuseos, Integer longitudMuralla){
        this.habitantes = habitantes;
        this.cantMuseos = cantMuseos;
        this.longitudMuralla = longitudMuralla;
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
        return cantMuseos >= 2 && habitantes.stream()
                                .allMatch(habitante -> habitante.inteligencia() >= 10);
    }

    public Integer potenciaReal(){
        return habitantes.stream()
            .mapToInt(habitante -> habitante.potencia())
            .sum();
    }
    
    /* 
    public Integer potenciaReal2(){
        var sumatorias = 0;
        for (Persona h : habitantes) {
            sumatorias += h.potencia();
        }
        return sumatorias;
    }
    */

    // Mas sobre el planeta

    public void construirMuralla(Integer kilometros){
        this.longitudMuralla += kilometros;
    }

    public void fundarMuseo(){
        this.cantMuseos += 1;
    }

    public Integer getLongitudMuralla(){
        return longitudMuralla;
    }

    public Integer getCantMuseos(){
        return cantMuseos;
    }

    /*
    public Integer potenciaAparente2(){
        var potencias = habitantes.stream()
        .mapToInt(habitante -> habitante.potencia())
        .max();
        return potencias.isPresent() ? potencias.getAsInt() * habitantes.size() : 0;
    }
    */

    public Integer potenciaAparente(){
        var habitanteMasPotente = habitantes.stream()
                            .max((h1, h2) -> h1.potencia() - h2.potencia())
                            .get();
        return habitanteMasPotente.potencia() * habitantes.size();
    }

    public Boolean necesitaReforzarse(){
        return this.potenciaAparente() >= this.potenciaReal() * 2;
    }

    public void recibirTributos(){
        for (Persona h : habitantes) {
            h.ofrecerTributo(this);
        }
    }

    // Valor de cada persona

    public List<Persona> habitantesValiosos(){
        return habitantes.stream()
            .filter(habitante -> habitante.valor() >= 40)
            .toList();
    }

    // Apaciguar otro planeta

    public void apaciguarOtroPlaneta(Planeta otroPlaneta){
        habitantesValiosos().forEach(h -> h.ofrecerTributo(otroPlaneta));

    }
}
