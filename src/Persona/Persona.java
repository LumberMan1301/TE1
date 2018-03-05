package Persona;

/**
 * <p>
 * La siguiente es una clase demostrativa, para representar algunos de los conceptos basicos de POO,
 * en este preograma se van a representar lso conceptos de:
 * Abstracccion, Encapsulacion, Clase, Atributo, Metodo, Instancia, Herencia, Polimorfismo, Override, Overload, y Modularidad
 * </p>
 * <p>
 *     Se presenta el contexto en el cual se ambienta la implementacion de la siguiente solucion:
 *     Una entidad de enseñanza desea llevar el control tanto de funcionarios como de estudiantes, mediante la creacion
 *     de archivos(Personas) con caracteristicas similares, pero que el sistema logre reconocer que son entidades separadas.
 * </p>
 */

/**
 * aqui se importan los metodos de las clases dentro del ModuloArchivar, las cuales pueden ser usadas por las clases derivadas
 */

import static ModuloArchivar.Impresion.imprimir;
import static ModuloArchivar.PDF.generarPdf;

/**
 * La siguiente es la Super-clase Persona, aqui podemos apreciar el concepto de Abstraccion, ya que determinamos
 * las caracteristicas mas reelevantes de el objeto persona, adapatdos para este contexto en especial, asi mismo
 * se abarca el concepto de clase, ya que la construccion de la clase viene de la abstraccion del objeto.
 * La clase es de tipo abstracta para que no se puedan crear instancias de ella, sino que solo se ´puedan crear
 * instancias de sus clases derivadas
 */
public abstract class Persona {


    /**
     * Se declaran las varibles de nuestra clase padre, en este punto podemos apreciar los atributos de el Objeto Persona
     * que son el resultado de la Abstraccion, para este contexto en especifico del objeto nada mas se ocuparon los atributos
     * nombre, sexo y edad.
     */
    protected String nombre;
    protected String sexo;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    /**
     * Se presenta el constructor de la clase, el cual es un metodo especial para inicializar las instancias
     *
     * @param nombre
     * @param sexo
     * @param edad
     */
    public Persona(String nombre, String sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        System.out.println("La persona "+ this.nombre + " ha sido creada con exito");
    }

    /**
     * metodo publico para mostrar la informacion almacenada en una intancia
     * la encapsulacion se relaciona con la palabra clave de ocultar, en este metodo podemos observar coomo
     * se oculta la implementacion de mostrar la informacion, llamando de un metodo publico a un metodo privado,
     * al metodo publico se puede acceder facilmente, mas en cambio al metodo privado solo se puede acceder por
     * medio del metodo publico.
     */
    public void mostrarInformacion(){
            mostrarInformacionP();
        }

    /**
     * metodo privado que contiene la logica.
     */
    private void mostrarInformacionP(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Sexo: "+ this.sexo);
        System.out.println("Edad: " + edad);

        }
    public void generarDoc(){
        generarDocP();
    }
    private void generarDocP(){
        generarPdf(this.getNombre());
    }

    public void imprime(){
        imprimeP();
    }
    private void imprimeP(){
        imprimir();
    }
}
