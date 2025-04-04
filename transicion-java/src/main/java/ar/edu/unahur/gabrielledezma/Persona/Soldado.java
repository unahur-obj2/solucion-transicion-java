package ar.edu.unahur.gabrielledezma.Persona;

import java.util.List;

import ar.edu.unahur.gabrielledezma.Arma.Arma;
import ar.edu.unahur.gabrielledezma.Planeta.Planeta;

public class Soldado extends Persona{
    private List<Arma> armas;
    
    public Soldado(Integer edad) {
        super(edad);
    }

    public Soldado(Integer edad, List<Arma> armas) {
        super(edad);
        this.armas = armas;
    }

    public Integer potencia(){
        return super.potencia() + armas.stream()
            .mapToInt(arma -> arma.potencia(this))
            .sum();
    }

    /* 
    public Integer potencia2(){
        var potenciaArmas = 0;
        for (Arma a : armas) {
            potenciaArmas += a.potencia(this);
        }
        return super.potencia() + potenciaArmas;
    }
    */

    public void ofrecerTributo(Planeta p){
        p.construirMuralla(5);
    }
}
