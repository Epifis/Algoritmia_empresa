package EMPRESAAVIACION;

/**
 *
 * @author sg702-12
 */
public class empresa {
    private String nombre, direccion;
    private ruta ruta01;
    
    //Declaracion constructor
    
    public empresa(){
        ruta01= new ruta();
        ruta02= new ruta();
        ruta03= new ruta();
}
    public Empresa(String unNombre, String unaDireccion){
        this.nombre=unNombre;
        this.direccion=unaDireccion;
    }

    public Empresa(Ruta ruta01, Ruta ruta02, Ruta ruta03) {
        this.ruta01 = ruta01;
        this.ruta02 = ruta02;
        this.ruta03 = ruta03;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String ruta(int identificador,String origen, String destino){
        return null
            ;
    }

    public String setRuta(ruta ruta01) {
        return "empresa{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
}
