import Persona.Persona;
import Persona.Estudiante;
import Persona.Funcionario;

public class Main {
    public static void main (String [] args){
        Estudiante e1 = new Estudiante("Steven", "Hombre", 22, "Computadores");
        e1.mostrarInformacion();
        Estudiante e2 = new Estudiante("Karla", "mujer", 21, "Computadores");
        e2.mostrarInformacion();

        Funcionario f1 = new Funcionario("Martin", "hombre", 30, "Operador");
        f1.mostrarInformacion();


    }
}
