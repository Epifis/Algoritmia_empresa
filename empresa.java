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
