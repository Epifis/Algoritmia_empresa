package EMPRESAAVIACION;

import java.util.Scanner;

/**
 *
 * @author sg702-12
 */
public class EmpresaDeAviacion {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //Sacnner
        Scanner cs= new Scanner(System.in);
        
        empresa em01;
        em01 = new empresa();
        em01.setNombre("Avianca");
        em01.setDireccion("Cll 26 68-05");
        
        //valor atributos
        
        System.out.println("Nombre: " + em01.getNombre());
        System.out.println("Dirección: " + em01.getDireccion());
        
        Vuelo mivuelo;
        mivuelo = new Vuelo(Vuelo.domingo, 5, "8sxhu23");
        //mivuelo.setDias(Vuelo.lunes);
        
        System.out.println("Mi vuelo: " + mivuelo.getCodigo() + ", " + mivuelo.getDias() + ", " + mivuelo.getHoras());
        ruta r01;
        r01 = new ruta("España", "No sé", 5);
        em01.setRuta01(r01);
    }
}