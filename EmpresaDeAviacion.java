package EMPRESAAVIACION;

/**
 *
 * @author Alexandra Tinjaca
 */
public class EmpresaDeAviacion {

    /**
     * @param args
     */
    public static void main(String[] args) {

        
        empresa em01;
        em01 = new empresa();
        em01.setNombre("Avianca");
        em01.setDireccion("Cll 26 68-05");

        //Asignacion rutas
        ruta r01;
        r01 = new ruta("España", "No sé", 5);
        em01.setRuta01(r01);
        ruta r02;
        r02 = new ruta("Alemania", "No sé", 23);
        em01.setRuta02(r02);
        ruta r03;
        r03 = new ruta("Canada", "No sé", 93);
        em01.setRuta03(r03);
        
        //Asignacion vuelos
        
        Vuelo vuelo01;
        vuelo01 = new Vuelo(2,4,"Un codigo");
        Vuelo vuelo02;
        vuelo02 = new Vuelo(5,6,"Otro codigo");
        
        //Asignacion de vuelos en cada ruta
        
        r01.setVuelo01(vuelo01);
        r01.setVuelo02(vuelo02);
        r02.setVuelo01(vuelo01);
        r02.setVuelo02(vuelo02);
        r03.setVuelo01(vuelo01);
        r03.setVuelo02(vuelo02);
        
        System.out.println("Empresa" + em01.getNombre()+ "\n Ruta 1: " + em01.getRuta01() + "\n Ruta 2: " + em01.getRuta03()+ "\n Ruta 3: " + em01.getRuta03());
    }

}
