package ar.edu.unahur.gabrielledezma.Persona;

import ar.edu.unahur.gabrielledezma.Planeta.Planeta;

public class Persona {

    private Integer edad;

    //private final Integer potencia = 20; //consultar si utilizamos constantes o metodos

    public Persona(Integer edad){
        this.edad = edad;
    }

    public Integer getEdad(){
        return edad;
    }

    public Integer inteligencia(){
        return edad >= 20 && edad <=40 ? 12 : 8; 
    } 

    public Integer potencia(){
        return 20;
    }
    
    public Boolean esDestacada(){
        return edad == 25 || edad == 35;
    }

    public void ofrecerTributo(Planeta p){

    }

    // Valor de cada persona

    public Integer valor(){
        return potencia() + inteligencia();
    }
    
}
