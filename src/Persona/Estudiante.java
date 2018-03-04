package Persona;

public class Estudiante extends Persona{


    private String carrera;
    private static int carnet = 2016000000;

    public String getCarrera() {
        return carrera;
    }

    public static int getCarnet() {
        return carnet;
    }

    public Estudiante(String nombre, String sexo, int edad, String carrera) {
        super(nombre, sexo, edad);
        this.carrera = carrera;
        this.carnet= carnet;
        carnet+=1;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarInformacionE();
    }
    private void mostrarInformacionE(){
        System.out.println("Carrera: "+ this.carrera);
        System.out.println("Carné: "+ this.carnet+"\n");
    }

}
