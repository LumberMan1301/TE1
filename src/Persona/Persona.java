package Persona;

public abstract class Persona {
    protected String nombre;
    protected String sexo;
    protected int edad;


    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        System.out.println("La persona "+ this.nombre + " ha sido creada con exito");
    }

    public void mostrarInformacion(){
            mostrarInformacionP();
        }
    private void mostrarInformacionP(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("Edad: " + edad);

        }
}
