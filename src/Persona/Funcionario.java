package Persona;

/**
 * la siguiente es una clase derivada de la clase Persona, podemos observar que se esta empleando la herencia
 * mediante la palabra reservada "extends", la cual sirve para referenciar que la clase Funcionario es Hija
 * de la clase Persona
 */


public class Funcionario extends Persona {
    /**
     * atributos mas relevantes de la clase Funcionario
     * el atributo "codFuncionario" es estatico debido a que necesitamos que el valor se guarde aun despues de
     * terminarse de ejecutar el metodo constructor
     */
    private String puesto;
    private static int codFuncionario = 0000;

    /**
     * Constructor de la Clase Funcionario
     * @param nombre
     * @param sexo
     * @param edad
     * @param puesto
     */
    public Funcionario(String nombre, String sexo, int edad, String puesto) {
        super(nombre, sexo, edad);
        this.puesto = puesto;
        this.codFuncionario = codFuncionario;
        codFuncionario+=1;

        }

    /**
     * Se presenta una modificacion del metodo heredado que funciona para mostrar la informacion de
     * los objetos creados, con lo que se abarca el concepto de sobre-escritura, se identifica la sobre-escritura
     * debido a la presencia de la frase reservada "@Override", e igualmente se encapsula el metodo.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarInformacionF();
    }

    /**
     * metodo privado que contien la logica detras del metodo publico
     */
    private void mostrarInformacionF(){
        System.out.println("Puesto: "+ this.puesto);
        System.out.println("Codigo de Funcionario: "+ this.codFuncionario+"\n");
    }
}


