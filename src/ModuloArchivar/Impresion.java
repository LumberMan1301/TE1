package ModuloArchivar;

public class Impresion {

    public static void imprimir(){
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
    private static void pausa(){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

