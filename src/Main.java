
import Persona.Estudiante;
import Persona.Funcionario;

/**
 * esta es la clase Main, la cual funciona para ejecutar pruebas al codigo
 */
public class Main {
    /**
     * metodo especial para ser ejecutado
     * @param args
     */
    public static void main (String [] args){
        /**
         * se crea la instacia "e1" y "e2", con esto cubrimos el concepto de instancia
         * las mismas son creadas con la clase Estudiante, aqui tambien podemos observar el concepto de Polimorfismo,
         * ya que los dos objetos "e1"y "e2" (que son evidentemente diferentes), se comportan de la misma manera
         * al ejecutar ambos el metodo mostraInformacion()
         */
        Estudiante e1 = new Estudiante("Steven", "Hombre", 22, "Computadores");
        e1.mostrarInformacion();
        Estudiante e2 = new Estudiante("Karla", "mujer", 21, "Computadores");
        e2.mostrarInformacion();
        /**
         * se crea la instacia f1 proveniente de la clase Funcionario
         */
        Funcionario f1 = new Funcionario("Martin", "hombre", 30, "Operador");
        f1.mostrarInformacion();


    }
}
