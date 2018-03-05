package ModuloArchivar;

import Persona.*;

public class PDF {

    public static void generarPdf(String nombre)  {
        System.out.println("Generando PDF de :"+ nombre);
        int cantSegundos = 0;
        while (cantSegundos<4){
            pausa();
            System.out.print(". ");
            cantSegundos+=1;
        }
        System.out.println("\n Se ha generado el documento");

    }
    private static void pausa(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
