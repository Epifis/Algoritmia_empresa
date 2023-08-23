package EMPRESAAVIACION;

/**
 *
 * @author Alexandra Tinjaca
 */
public class ruta {

    private int id;
    private String origen, destino;
    
    public ruta(){
        }
    public ruta(String unorigen, String undestino, int unId){
        this.destino = undestino;
        this.id = unId;
        this.destino = undestino;
        
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
}

