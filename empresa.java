package EMPRESAAVIACION;

/**
 *
 * @author sg702-12
 */
public class empresa {
    private String nombre, direccion;
    private ruta r01;
    private ruta r02;
    private ruta r03;

    
    //Declaracion constructor
    
    public empresa(){
        r01= new ruta();
        r02= new ruta();
        r03= new ruta();
        
}
    public empresa(String unNombre, String unaDireccion){
        this.nombre=unNombre;
        this.direccion=unaDireccion;
    }

    public empresa(ruta r01, ruta r02, ruta r03){
        this.r01 = r01;
        this.r02 = r02;
        this.r03 = r03;
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

    public void crearRuta(int identificador, String origen, String destino) {

    }
    
    //Get y set para las rutas

    public ruta getRuta01() {
        return r01;
    }

    public void setRuta01(ruta r01) {
        this.r01 = r01;
    }

    public ruta getRuta02() {
        return r02;
    }

    public void setRuta02(ruta r02) {
        this.r02 = r02;
    }

    public ruta getRuta03() {
        return r03;
    }

    public void setRuta03(ruta r03) {
        this.r03 = r03;
    }
    public void leerAtributos(){
        
    }
    primero.leerAtributos();
    
    double nuevosalario;
    nuevosalario= primero.getsalario()*2;
    
    @Override
    public String toString() {
        return "Empresa" + "nombre=" + nombre + ", direccion=" + direccion + ",\n ruta01=" + r01.toString() + ",\n ruta02=" + r02.toString() + ",\n ruta03=" + r03.toString();
    }
    
    

}
