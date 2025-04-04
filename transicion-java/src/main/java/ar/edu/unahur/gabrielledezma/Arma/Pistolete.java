package ar.edu.unahur.gabrielledezma.Arma;

import ar.edu.unahur.gabrielledezma.Persona.Soldado;

public class Pistolete implements Arma{

    private Integer largo;

    public Pistolete(Integer largo){
        this.largo = largo;
    }

    public Integer potencia(Soldado s){
        return s.getEdad() > 30 ? 3 * largo : 2 * largo; 
    }
    
}
