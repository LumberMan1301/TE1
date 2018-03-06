package ModuloArchivar;

/**
 * clase de Impresion, perteneciente al ModuloArchivar
 */
public class Impresion {
    /**
     * metodo publico imrprimir, static para que sea de acceso desde cualquier lugar
     */
    public static void imprimir(){
        imprimirP();
    }

    /**
     * metodo detras de la logica de imprimir
     */
    private static void imprimirP(){
        System.out.println("Imprimiendo informacion");
        int cantSegundos = 0;
        System.out.println(" __________");
        while (cantSegundos<8){
            pausa();
            System.out.println("|#$%&&&%$$#|");
            cantSegundos+=1;
        }
        System.out.println(" __________ ");
        System.out.println("\n se ha completado la impresion");

    }

    /**
     * metodo que genera pausas de sistema
     */
    private static void pausa(){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

