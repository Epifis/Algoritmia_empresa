package EMPRESAAVIACION;

/**
 *
 * @author Alexandra Tinjaca
 */
public class ruta {

    private int id;
    private String origen, destino;
    private Vuelo vuelo01;
    private Vuelo vuelo02;
    
    public ruta(){
        vuelo01 = new Vuelo();
        vuelo02 = new Vuelo();
        }
    public ruta(String unorigen, String undestino, int unId){
        this.origen = unorigen;
        this.id = unId;
        this.destino = undestino;
        
    }
    public ruta(Vuelo vuelo01, Vuelo vuelo02){
        this.vuelo01 = vuelo01;
        this.vuelo02 = vuelo02;
    }
    public int getId (){
        return id;
    }
    public void setId (int id){
        this.id=id;
    }
    public String getOrigen (){
        return origen;
    }
    public void setOrigen (String origen){
        this.origen = origen;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    
    public void crearVuelo(int identificador, String origen, String destino) {

    }
    public Vuelo getVuelo01() {
        return vuelo01;
    }

    public void setVuelo01(Vuelo vuelo01) {
        this.vuelo01 = vuelo01;
    }
    public Vuelo getVuelo02() {
        return vuelo02;
    }

    public void setVuelo02(Vuelo vuelo02) {
        this.vuelo02 = vuelo02;
    }

    @Override
    public String toString() {
        return "\n      id=" + id + ", origen=" + origen + ", destino=" + destino + "\n          vuelo01=" + vuelo01.toString() + ", vuelo02=" + vuelo02.toString();
    }
    
}

