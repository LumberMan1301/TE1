import Persona.Estudiante;
import Persona.Funcionario;
/**
 * esta es la clase Main, la cual funciona para ejecutar pruebas al codigo
 */
public class Main {
    /**
     * metodo especial para abrir la consola del IDE
     * @param args
     */
    public static void main (String [] args){
        /**
         * <p>
         * se crea la instacia "e1" y "e2", con esto cubrimos el concepto de instancia
         * las mismas son creadas con la clase Estudiante, aqui tambien podemos observar el concepto de Polimorfismo,
         * ya que los dos objetos "e1"y "e2" (que son evidentemente diferentes), se comportan de la misma manera
         * al ejecutar ambos el metodo mostraInformacion()
         * </p>
         * <p>
         *     aca podemos apreciar el resultado final de la abstraccion, que atravez de la clase genera
         *     instancias del molde definido
         * </p>
         */
        Estudiante e1 = new Estudiante("Steven", "Hombre", 22, "Computadores");
        e1.mostrarInformacion();
        Estudiante e2 = new Estudiante("Karla", "mujer", 21, "Computadores");
        e2.mostrarInformacion();
        /**
         * se crea la instacia "f1" y "f2" proveniente de la clase Funcionario
         */
        Funcionario f1 = new Funcionario("Martin", "hombre", 30, "Operador");
        f1.mostrarInformacion();
/**
 * al crear dos instancias a partir de la misma clase, pero con cantidad de parametros diferentes podemos deducir
 * que hay almenos dos constructores, lo que supone una sobrecarga del metodo constructor
 */
        Funcionario f2 = new Funcionario("Norma", "Mujer", 23);
        f2.mostrarInformacion();
        f2.generarDoc();
        f2.imprime();
        /**
         * se mandan a llamar los metodos de las clases, por ejemplo Funcionario no tiene dentro de su codigo .imprime();
         * pero como lo hereda de Persona si lo puede usar
         */

    }
}
