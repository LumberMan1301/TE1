package Persona;

public abstract class Estudiante extends Persona{
    private String carrera;
    private static int carnet = 2016000000;

    public Estudiante(String nombre, String sexo, int edad, String carrera) {
        super(nombre, sexo, edad);
        this.carrera = carrera;
        this.carnet= carnet;
        carnet+=1;
    }

}
