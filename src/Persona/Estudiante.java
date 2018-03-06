package Persona;
/**
 * Clase estudiante derivada de Persona
 */
public class Estudiante extends Persona{
    /**
     * atributos de la clase Estudiante
     */
    private String carrera;
    private static int carnet = 2016000000;
    /**
     * getter del atributo carrera
     * @return carrera
     */
    public String getCarrera() {
        return carrera;
    }
    /**
     * getter del atributo carnet
     * @return carnet
     */
    public static int getCarnet() {
        return carnet;
    }
    /**
     * Constructor de la Clase estudiante
     * @param nombre
     * @param sexo
     * @param edad
     * @param carrera
     */
    public Estudiante(String nombre, String sexo, int edad, String carrera) {
        super(nombre, sexo, edad);
        this.carrera = carrera;
        this.carnet= carnet;
        carnet+=1;
    }
    /**
     * metodo de acceso publico para mostrar la informacion del estudiante
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarInformacionE();
    }
    /**
     * metodo que contiene la logica detras del metodo publico mostrarInformacion()
     */
    private void mostrarInformacionE(){
        System.out.println("Carrera: "+ this.carrera);
        System.out.println("Carné: "+ this.carnet+"\n");
    }

}
