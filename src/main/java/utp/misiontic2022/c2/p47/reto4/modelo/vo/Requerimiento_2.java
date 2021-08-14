package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    // Su código

    private Integer ID_MaterialConstruccion;
    private String NombreMaterial;
    private Integer Cantidad;
    private Integer PrecioU;
    private Integer PrecioT;
    public Requerimiento_2(){

    }

    
    public Requerimiento_2(Integer iD_MaterialConstruccion, String nombreMaterial, Integer cantidad, Integer precioU,
            Integer precioT) {
        this.ID_MaterialConstruccion = iD_MaterialConstruccion;
        this.NombreMaterial = nombreMaterial;
        this.Cantidad = cantidad;
        this.PrecioU = precioU;
        this.PrecioT = precioT;
    }


    public Integer getID_MaterialConstruccion() {
        return ID_MaterialConstruccion;
    }
    public void setID_MaterialConstruccion(Integer iD_MaterialConstruccion) {
        this.ID_MaterialConstruccion = iD_MaterialConstruccion;
    }
    public String getNombreMaterial() {
        return NombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        NombreMaterial = nombreMaterial;
    }
    public Integer getCantidad() {
        return Cantidad;
    }
    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }
    public Integer getPrecioU() {
        return PrecioU;
    }
    public void setPrecioU(Integer precioU) {
        PrecioU = precioU;
    }
    public Integer getPrecioT() {
        return PrecioT;
    }
    public void setPrecioT(Integer precioT) {
        PrecioT = precioT;
    }
    @Override
    public String toString()
    {
    
        return ID_MaterialConstruccion+" "+ NombreMaterial+" "+Cantidad+" "+PrecioU+" "+PrecioT+"\n";
  
    }

    
}
