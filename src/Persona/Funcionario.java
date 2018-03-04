package Persona;

public abstract class Funcionario extends Persona {
    private String puesto;
    private String codFuncionario;


    public Funcionario(String nombre, String sexo, int edad) {
        super(nombre, sexo, edad);
    }
}
