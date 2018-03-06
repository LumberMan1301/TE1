package ModuloArchivar;

import Persona.*;

public class PDF {
    /**
     * metodo que genera un PDF apartir del nomrbe recibido
     * @param nombre
     */
    public static void generarPdf(String nombre){
        generarPdfP(nombre);
    }

    /**
     * metodo que contiene la logica detras de generarPdf
     * @param nombre
     */
    private static void generarPdfP(String nombre)  {
        System.out.println("Generando PDF de :"+ nombre);
        int cantSegundos = 0;
        while (cantSegundos<4){
            pausa();
            System.out.print(". ");
            cantSegundos+=1;
        }
        System.out.println("\n Se ha generado el documento");

    }
    /**
     * metodo que genera pausas de sistema
     */
    private static void pausa(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
