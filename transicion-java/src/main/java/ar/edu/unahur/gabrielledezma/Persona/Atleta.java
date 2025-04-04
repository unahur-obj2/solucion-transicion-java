package ar.edu.unahur.gabrielledezma.Persona;

public class Atleta extends Persona{

    private Integer masaMuscular = 4;
    private Integer cantTecnicas = 2;

    public Atleta(Integer edad) {
        super(edad);
    }

    public Atleta(Integer edad, Integer cantTecnicas) {
        super(edad);
        this.cantTecnicas = cantTecnicas;
    }

    public Atleta(Integer edad, Integer cantTecnicas, Integer masaMuscular) {
        super(edad);
        this.cantTecnicas = cantTecnicas;
        this.masaMuscular = masaMuscular;
    }

    public Integer getCantTecnicas() {
        return cantTecnicas;
    }

    public Integer getMasaMuscular() {
        return masaMuscular;
    }

    @Override
    public Integer potencia(){
        return super.potencia() + masaMuscular * cantTecnicas; //consultar
    } 

    @Override
    public Boolean esDestacada(){
        return super.esDestacada() || cantTecnicas > 5;
    }

    public void entrenar(Integer cantDias){
       masaMuscular += cantDias / 5;        
    }

    public void aprenderTecnica(){
        cantTecnicas += 1;
    }
}
