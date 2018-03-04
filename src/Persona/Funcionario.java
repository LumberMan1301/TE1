package Persona;




public class Funcionario extends Persona {
    private String puesto;
    private static int codFuncionario = 0000;


    public Funcionario(String nombre, String sexo, int edad, String puesto) {
        super(nombre, sexo, edad);
        this.puesto = puesto;
        this.codFuncionario = codFuncionario;
        codFuncionario+=1;

        }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        mostrarInformacionF();
    }

    private void mostrarInformacionF(){
        System.out.println("Puesto: "+ this.puesto);
        System.out.println("Codigo de Funcionario: "+ this.codFuncionario+"\n");
    }
}


