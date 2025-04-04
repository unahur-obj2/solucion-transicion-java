package ar.edu.unahur.gabrielledezma.Arma;

import ar.edu.unahur.gabrielledezma.Persona.Soldado;

public class Espadon implements Arma {
    private Integer peso;

    public Espadon(Integer peso){
        this.peso = peso;
    }

    public Integer potencia(Soldado s){
        return s.getEdad() < 40 ? peso / 2 : 6; 
    }
}
